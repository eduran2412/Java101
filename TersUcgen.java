import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Basamak Sayısı Giriniz : ");
        num = scanner.nextInt();

        for (int i=num; i>=1; i--){

            for (int j = 1; j<=(num-i); j++)
                System.out.print(" ");
            for (int k=(2*i-1); k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
