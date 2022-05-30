
import java.util.Scanner;
public class Combination {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n,r;
        double c;
        int totalN=1, totalR=1 ,totalX=1;
        System.out.print("Kümenin Eleman Sayısını Giriniz : ");
        n = scanner.nextInt();

        System.out.print("Alt Kümenin Eleman Sayısını Giriniz : ");
        r = scanner.nextInt();

        if (r<n){
            for(int i = 1; i<=n; i++){
                totalN = totalN * i;
            }
            for (int j = 1; j<=r; j++){
                totalR = totalR * j;
            }
            for (int k = 1; k<=(n-r); k++){
                totalX = totalX * k;
            }

            c = totalN/(totalR*totalX);

            System.out.print(n + " sayısının " +r + " sayısına göre kombinasyonu : " +c);
        }else
            System.out.println("Girilen Değerleri Kontrol Ediniz!");


    }
}

//N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//
//Java ile kombinasyon hesaplayan program yazınız.
//
//Kombinasyon formülü C(n,r) = n! / (r! * (n-r)!)
