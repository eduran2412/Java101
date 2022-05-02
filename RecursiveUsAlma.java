import java.util.Scanner;
public class RecursiveUsAlma {

    static int pow(int base, int exponent){

        if (exponent==0){
            return 1;
        }
       int result = base * pow(base,exponent-1);
       return result;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int exponent,base;
        System.out.print("Taban değeri giriniz : ");
        base = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        exponent = scanner.nextInt();
        System.out.println("Sonuç : "+pow(base,exponent));
    }
}
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
// "Recursive" metot kullanarak yapan programı yazınız.
