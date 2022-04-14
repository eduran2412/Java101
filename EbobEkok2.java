import java.util.Scanner;
public class EbobEkok2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2, ebob=1, ekok=1, select;

        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = scanner.nextInt();

        System.out.print("Ebob için 1'i Ekok için 2'yi seçiniz : ");
        select = scanner.nextInt();

        if (select==1){
            if (num1>num2){
                int i=1;
                while (i<=num2){
                    if (num1 % i == 0 && num2 % i == 0){
                        ebob = i ;
                    }
                    i++;
                }System.out.println("Sayıların Ebob'u "+ebob);
            }else if (num2>num1){
                int j=num1;
                while (j>0){
                    if (num1 % j== 0 && num2%j == 0){
                        ebob = j;
                        break;
                    }
                    j--;
                }System.out.println("Sayıların Ebob'u "+ebob);
            }else if (num1==num2){
                System.out.println("Sayıların Ebob'u "+num1);
            }
        }else if (select==2){
            int k=1;
            while (k<=num1*num2){
                if (k % num1 == 0 && k % num2 == 0){
                    ekok = k;
                    System.out.println("Sayıların Ekok'u "+ekok);
                    break;
                }
                k++;
            }
        }

    }
}
