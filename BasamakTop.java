import java.util.Scanner;
public class BasamakTop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num,stepValue,result=0,counter=0;

        System.out.print("Bir sayı giriniz : ");
        num = scanner.nextInt();

        System.out.print("Girilen Sayının Basamak Değerlerinin Toplamı = ");

        while (num != 0){
            stepValue =num % 10;
            result += stepValue;

            System.out.print(" + "+stepValue);

            num /= 10;
            counter++;

        }
        System.out.println(" = "+result);

        System.out.println("Basamak Sayısı = "+counter);
    }
}

//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//
//Örnek : 1643 = 1 + 6 + 4 + 3 = 14