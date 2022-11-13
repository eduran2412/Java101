package Odev18DoWhileLoop4UnKati;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n, sum=0;

        do {

            System.out.print("Bir Sayı Giriniz : ");
            n=scanner.nextInt();

            if (n%4==0){
                sum+=n;
            }

        }while(n%2==0 && (n>0));
        // ilk başta tek sayı veya pozitif olmayan sayı girilirse sonuç sıfır olacak
        System.out.println("Çift olup 4'e Kalansız Bölünen Pozitif Sayıların Toplamı : " +sum);

    }
}
