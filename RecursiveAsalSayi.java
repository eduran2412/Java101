import java.util.Scanner;
public class RecursiveAsalSayi {


    public static int isPrime(int value, int divide){
        if (divide==1){
            return 1;
        }else if(divide<1){
            return 0;
        }else if(value % divide == 0){
            return 0;
        }
        return isPrime(value,--divide);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int value = scan.nextInt();
        int divide = value -1;
        if(isPrime(value, divide) == 1) System.out.println(value + " sayısı ASALDIR!");
        else System.out.println(value + " sayısı ASAL değildir!");

    }
}
