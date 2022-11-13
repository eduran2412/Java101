package Odev11HavaSicakligi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapmayı Deneyebilirsin..");
        } else if (heat >= 5 && heat < 10) {
            System.out.println("Sinemaya Gidebilirsin..");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("Sinemaya veya Piknik Yapmaya Gidebilirsin..");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Piknik Yapmaya Gidebilirsin..");
        } else {
            System.out.println("Yüzmeye Gidebilirsin..");
        }


     /*   if (heat < 5){
            System.out.println("Kayak Yapabilirsin..");
        }else if(heat <= 25){
            if (heat<=15){
                System.out.println("Sinemaya Gidebilirsin..");
            }
            if (heat>=10){
                System.out.println("Piknik Yapabilirsin..");
            }
        }else {
            System.out.println("Yüzmeye Gidebilirsin..");
        }  */

    }
}