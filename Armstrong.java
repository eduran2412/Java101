
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){

        int girilenSayi,basamakSayisi=0,usluDeger,basamakDegeri=0, usluToplami=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        girilenSayi = scanner.nextInt();

        int geçiciGirilenSayi = girilenSayi; // girilen sayı kaybolmasın, en son karşılaştırma yapalım diye

        while (geçiciGirilenSayi!=0){
            geçiciGirilenSayi /= 10;
            basamakSayisi++;   // kaç basamaklı olduğu

        }

        geçiciGirilenSayi = girilenSayi; // 2. while için tekrar girilen sayı değeri lazım

        while (geçiciGirilenSayi!=0){

            basamakDegeri= geçiciGirilenSayi % 10;  // basamağın değeri mod alma

            usluDeger = 1;
            for(int i=1; i<=basamakSayisi; i++){
                usluDeger *= basamakDegeri;
            }

            geçiciGirilenSayi /= 10;
            usluToplami += usluDeger;

        }

        if (girilenSayi == usluToplami){
            System.out.println(girilenSayi+" Bir Armstrong Sayıdır..");
        }else
            System.out.println(girilenSayi+" Bir Armstrong Sayı Değildir!!");



    }
}
//Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
//
//Armstrong Sayı Nedir ? N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
//
//Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
//
//1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
//
//1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
//
//54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
