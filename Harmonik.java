import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        double result = 0;

        System.out.print("N değeri giriniz : ");
        n = scanner.nextInt();

        for (double i = 1; i<=n; i++){
            result += (1/i);
        }
        System.out.println("Harmonik Seri Toplamı : "+result);
    }
}

//Java ile girilen sayının harmonik serisini bulan program yazacağız.