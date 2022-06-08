package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);


    String[][] map;
    String[][] board;
    int rowNumber, colNumber, size;
    boolean isWin = true;
    int sum = 0;

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

    public void run() {
        System.out.println("--------------------");
        System.out.println("Oyun Başladı!");
        int row, col;
        int succes = 0;
        createMines();
        //   print(map);
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
                        print(map);
                    }

                } else {
                    System.out.println("Geçersiz bir koordinat girdiniz!!");
                }

            } catch (Exception e) {
                System.out.println("Satır ve Sütun Girerken RAKAM kullanınız!!");
            }
        }


    }

    public void print(String[][] arr) {
        System.out.println("*==================*");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void check(int r, int c) {
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
