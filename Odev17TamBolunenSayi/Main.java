package Odev17TamBolunenSayi;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k, count=0;
        double sum = 0, average;

        System.out.print("Bir Sayı Giriniz : ");
        k = scanner.nextInt();

        for (int i=1; i<=k ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
                System.out.print(" " + i);
            }
        }

        System.out.println(" ");
        average = sum/count;
        System.out.println("Ortalama = " +average);
    }
}
