import java.util.Scanner;
public class Yildiz {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısı girin : ");
        n = scanner.nextInt();

        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
//Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.