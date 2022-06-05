import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        // programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu"

        Random rand = new Random();
        int number = rand.nextInt(100);

        // int number = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);

        int select;
        int right = 0;
        int[] wrong = new int[5]; 
        boolean isWrong = false;
        boolean isWin = false;

      //  System.out.println(number);

        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            select = scanner.nextInt();

            if (select < 0 || select > 99) {
                System.out.println("Lütfen 0 - 100 arası bir seçim yapınız (100 dahil değil)..");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }

                continue;
            }
            if (select != number) {

                if (select < number) {
                    System.out.println(select+" saysısı random seçilen sayıdan küçük");
                } else {
                    System.out.println(select+" sayısı random seçilen sayıdan büyük");
                }

                wrong[right++] = select;
                System.out.println("Kalan hak : " + (5 - right));

            } else {
                System.out.println("Tebrikler .. ");
                isWin = true;
                break;
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }

        }
    }
}
