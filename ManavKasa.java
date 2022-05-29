
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam;
        double armut = 2.14 ,elma = 3.67 ,domates=1.11 ,muz=0.95 ,patlıcan=5.00;
        float armutkilo ,elmaKilo ,domatesKilo ,muzKilo ,patlıcanKilo;

        System.out.print("Armut Kaç Kilo ? :");
        armutkilo = scanner.nextFloat();
        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo = scanner.nextFloat();
        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = scanner.nextFloat();
        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = scanner.nextFloat();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcanKilo = scanner.nextFloat();

        // elmaKilo vb yapmak yerine toplam hesaplanırken elma*3.67 ile çarpılıp
        // hafızada daha da az yer kaplanılabiirdi ancak projenin komplex olmaması için bu şekilde yapıldı...
        toplam = (armut*armutkilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlıcan*patlıcanKilo);

        System.out.println("Toplam Tutar : " + toplam + "TL");



    }
}
//Manav Kasa Programı Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00 TL Örnek Çıktı;
//
//Armut Kaç Kilo ? :0 Elma Kaç Kilo ? :1 Domates Kaç Kilo ? :1 Muz Kaç Kilo ? :2 Patlıcan Kaç Kilo ? :3 Toplam Tutar : 21.68 TL