import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num,total=0,a=0,b=1,c=0;
        System.out.print("Eleman Sayısı : ");
        num = scanner.nextInt();

        for (int i=1; i<=num; i++){
            total = a+b;
            System.out.println(a+" + "+b+" = "+total);
            a=b;
            b=total;
        }

    }
}
