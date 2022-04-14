import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args){
        int num,total=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        num = scanner.nextInt();

        for (int i=1; i<num; i++){
            if (num % i == 0){
                total += i;
            }
        }
        System.out.println("--------------");

        if (total==num){
            System.out.println(num+" Mükemmel Sayıdır..");
        }else {
            System.out.println(num+" Mükemmel Sayı Değildir..");
        }
    }
}
