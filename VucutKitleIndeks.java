

import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float boy,kilo;
        double index;

        System.out.print("Kilonuzu 'kg' Cinsinden Giriniz : ");
        kilo = input.nextFloat();
        System.out.print("Boyunuzu 'm' Cinsinden Giriniz : ");
        boy = input.nextFloat();

        index = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndexiniz : " + index);


    }
}
//Vücut Kitle İndeksi Hesaplama Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
//
//Formül Kilo (kg) / Boy(m) * Boy(m)
//
//Çıktısı Lütfen boyunuzu (metre cinsinde) giriniz : 1,72 Lütfen kilonuzu giriniz : 105 Vücut Kitle İndeksiniz : 35.49215792320173