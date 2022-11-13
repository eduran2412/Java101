package Odev10NotOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double matematik, fizik, turkce, kimya, muzik, average, total = 0;
        int counter = 0;


        System.out.print("Matemetik Notunuzu Giriniz : ");
        matematik = input.nextDouble();
        if(matematik<=100 && matematik>=0){
            total += matematik;
            counter++;
        }
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextDouble();
        if(fizik<=100 && fizik>=0){
            total += fizik;
            counter++;
        }
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextDouble();
        if (turkce<=100 && turkce>=0){
            total += turkce;
            counter++;
        }
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextDouble();
        if (kimya<=100 && kimya>=0){
            total += kimya;
            counter++;
        }
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextDouble();
        if (muzik<=100 && muzik>=0){
            total += muzik;
            counter++;
        }

        average = total/counter;

        System.out.println("Not Ortalamanız : " +average);
        if(average<55){
            System.out.println("Sınıfta Kaldınız..");
        }else{
            System.out.println("Sınıfı Geçtiniz..");
        }

    }
}
