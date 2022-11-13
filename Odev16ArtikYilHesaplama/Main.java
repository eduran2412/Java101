package Odev16ArtikYilHesaplama;

import java.util.Scanner;
public class Main {
    public static void main(String[] ags){
        int yil;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = scanner.nextInt();

        if (yil % 4 == 0){
            if (yil%100==0 && !(yil%400==0)) {
                System.out.println(yil+" Bir artık yıl değildir!");
            }else {
                System.out.println(yil+" Bir artık yıldır");
            }
        }else {
            System.out.println(yil+" Bir artık yıl değildir!");
        }
    }
}