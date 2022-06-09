package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public void scary(String[][] mtr) { // mayına basınca korkunc yüz ifadesi cıkması icin

        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr[i].length; j++) {
                mtr[i][j] = " ";
                if ((i == 0 && (j == 0 || j == 6)) || (i == 6 && (j == 0 || j == 6))) {
                    mtr[i][j] = "*";
                }
                if ((i == 1 && (j == 1 || j == 5)) || (i == 5 && (j == 1 || j == 5))) {
                    mtr[i][j] = "*";
                }

            }

        }

        mtr[2][2] = "x";
        mtr[2][4] = "x";

        for (int i = 2; i <= 4; i++) {
            mtr[1][i] = ".";
            mtr[i][1] = ".";
            mtr[5][i] = ".";
            mtr[i][5] = ".";
            mtr[4][i] = "*";
        }


        for (String[] strings : mtr) {
            for (int j = 0; j < mtr[0].length; j++) {
                System.out.print(" " + strings[j]);
            }
            System.out.println();
        }


    }

    String[][] scaryFace = new String[7][7];
    String[][] map;
    String[][] board;
    int rowNumber, colNumber, size;
    static boolean isWin = true; // static yapıldı static metot içerisinde kullanabilmek için
    int sum = 0;


    public static boolean isMore() { // mayına basınca oyunun sonlanması için oluşturuldu.
        if (isWin == false) {
            return false;
        }
        return true;
    }

    MineSweeper(int rowNumber, int colNumber) { // constructor
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber;

    }

    public void createMines() { // mayınlı alan üretme
        int randRow, randCol, count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "-";
            }
        }

        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (map[randRow][randCol] != "*") {
                map[randRow][randCol] = "*";
                count++;
            }
        }

    }

    public void createBoard() {  // kullanıcının göreceği ekran
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = "-";
            }
        }

    }

    public void run() { // oyunun çalıştığı metot
        System.out.println("--------------------");
        System.out.println("Oyun Başladı!");
        int row, col;
        int succes = 0;
        createMines();
        print(map);
        createBoard();
        System.out.println("--------------------");

        while (isWin) {

            print(board);
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Satır Sayısı : ");
                row = scanner.nextInt();
                System.out.print("Sütun Sayısı : ");
                col = scanner.nextInt();

                if ((row >= 0 && row < rowNumber) && (col >= 0 && col < colNumber)) {
                    if (!map[row][col].equals("*")) {
                        check(row, col);
                        succes++;
                        if (succes == size - (size / 4)) {
                            System.out.println("Tebrikler Başardınız ..");
                            for (int i = 0; i < map.length; i++) {
                                for (int j = 0; j < map[0].length; j++) {
                                    if (map[i][j].equals("*")) {
                                        board[i][j] = "*";
                                    }
                                }
                            }
                            print(board);
                            break;
                        }
                    } else {
                        isWin = false;
                        System.out.println("Mayına Bastınız!");
                        scary(scaryFace);
                        System.out.println("Mayınların yerleri");
                        print(map);
                        isMore();
                    }

                } else {
                    System.out.println("Geçersiz bir koordinat girdiniz!!");
                }

            } catch (Exception e) {
                System.out.println("Satır ve Sütun Girerken RAKAM kullanınız!!");
            }
        }


    }

    public void print(String[][] arr) { // seçilen matrisi yazdırma
        System.out.println("*==================*");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void check(int r, int c) { // seçilen noktanın etrafındaki mayınları kontrol etme
        if (board[r][c].equals("-")) {
            if ((c < colNumber - 1) && (map[r][c + 1].equals("*"))) { //noktanın sağ tarafının kontrolü
                sum++;
            }
            if ((c > 0) && (map[r][c - 1].equals("*"))) { //noktanın sol tarafının kontrolü
                sum++;
            }
            if ((r < rowNumber - 1) && (map[r + 1][c].equals("*"))) { //noktanın alt tarafının kontrolü
                sum++;
            }
            if ((r > 0) && (map[r - 1][c].equals("*"))) { //noktanın üst tarafının kontrolü
                sum++;
            }
            if (((r > 0) && (c < colNumber - 1)) && (map[r - 1][c + 1].equals("*"))) { //noktanın sağ üst köşesinin kontrolü
                sum++;
            }
            if (((r < rowNumber - 1) && (c < colNumber - 1)) && (map[r + 1][c + 1].equals("*"))) { //noktanın sağ alt köşesinin kontrolü
                sum++;
            }
            if (((r < rowNumber - 1) && (c > 0)) && (map[r + 1][c - 1].equals("*"))) { //noktanın sol alt köşesinin kontrolü
                sum++;
            }
            if (((r > 0) && (c > 0)) && (map[r - 1][c - 1].equals("*"))) { //noktanın sol üst köşesinin kontrolü
                sum++;
            }
            board[r][c] = String.valueOf(sum);
        }
        sum = 0;
    }


}
