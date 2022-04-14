import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int select,n,max=0,min=0;

        System.out.print("Kaç Adet Sayı Girilecek : ");
        select = scanner.nextInt();

        for (int i=1; i<=select; i++){
            n = i;
            System.out.print(i+". Sayıyı Giriniz : ");
            n = scanner.nextInt();

            if (i==1){
                max = n;
                min = n;
            }

            if (n>=max){
                max = n;
            }
            if(n<=min){
                min = n;
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
