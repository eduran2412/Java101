package MineSweeper;

import java.util.Scanner;

import static MineSweeper.MineSweeper.isMore;


public class Main {

    static void basla() {


        while (isMore()) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Oyuna Hoşgeldiniz\n");

                System.out.print("Oluşturmak istediğiniz matrisin satır numarası :");
                int satır = scanner.nextInt();
                System.out.print("Oluşturmak istediğiniz matrisin sütun numarası :");
                int sütun = scanner.nextInt();

                if ((satır > 1) && (sütun > 1)) {
                    MineSweeper mineSweeper = new MineSweeper(satır, sütun);
                    mineSweeper.run();

                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Hata! Lütfen Girdiğiniz Değerleri Kontrol Edip Tekrar Deneyiniz...");

            }

        }


    }

    public static void main(String[] args) {

        basla();


    }


}

