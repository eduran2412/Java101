
import java.util.Scanner;

public class CalcSwitchCase {
    public static void main(String[] args) {
        // Bu yorum satırı deneme amaçlıdır!
        int  secim;
        double n1,n2;

        Scanner input = new Scanner(System.in);

        System.out.print("Toplama işlemi için 1'e\nÇıkarma işlemi için 2'ye\nÇarpma  işlemi için 3'e\nBölme   işlemi için 4'e Basınız.\nSeçiminiz : ");
        secim = input.nextInt();




        switch (secim) {

            case 1:
                System.out.print("İlk Sayıyı Giriniz : ");
                n1 = input.nextInt();
                System.out.print("İkinci Sayıyı Giriniz : ");
                n2 = input.nextInt();

                System.out.println(n1 + " ve " + n2 + " sayılarının toplamı : " + (n1 + n2));
                System.out.println("İşlem Sonuçlandı..");
                break;
            case 2:
                System.out.print("İlk Sayıyı Giriniz : ");
                n1 = input.nextInt();
                System.out.print("İkinci Sayıyı Giriniz : ");
                n2 = input.nextInt();

                System.out.println(n1 + " ve " + n2 + "sayılarının farkı : " + (n1 - n2));
                System.out.println("İşlem Sonuçlandı..");
                break;
            case 3:
                System.out.print("İlk Sayıyı Giriniz : ");
                n1 = input.nextInt();
                System.out.print("İkinci Sayıyı Giriniz : ");
                n2 = input.nextInt();

                System.out.println(n1 + " ve " + n2 + "sayılarının çarpımı : " + (n1 * n2));
                System.out.println("İşlem Sonuçlandı..");
                break;
            case 4:
                System.out.print("İlk Sayıyı Giriniz : ");
                n1 = input.nextInt();
                System.out.print("İkinci Sayıyı Giriniz : ");
                n2 = input.nextInt();

                // n1 double n2 int olunca çalışıyor bunun yerine if else kullanırsak n1 ve n2 yi double yapabiliriz.
              /*  switch (n2) {
                    case 0:
                        System.out.println("Bir Sayı 0'a Bölünemez!");
                        break;
                    default:
                        System.out.println(n1 + " Sayısının " + n2 + " Sayısına Bölümü : " + (n1 / n2));
                        break;
                }*/
                if(n2==0){
                    System.out.println("Bir Sayı 0'a Bölünemez!");
                }else{
                    System.out.println(n1 + " Sayısının " + n2 + " Sayısına Bölümü : " + (n1 / n2));
                    System.out.println("İşlem Sonuçlandı..");
                }
                break;

            default:
                System.out.println("Geçerli bir seçim yapınız..");
                break;


        }


    }
}