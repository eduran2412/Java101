 import java.util.Scanner;
    public class KdvHesaplama {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            Double deger,kdv,deger2;

            System.out.print("Değer giriniz :");
            deger = inp.nextDouble();

            System.out.print("KDV oranı giriniz :");
            kdv = inp.nextDouble();

            deger2 = ((kdv/100)*deger)+deger;

            System.out.println("KDV'siz fiyat :" +deger);
            System.out.println("KDV'li fiyat :" +deger2);
            System.out.println("KDV tutarı :" +(deger2-deger));
        }
    }
/*
KDV Tutarı Hesaplayan Program Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
