import java.util.Scanner;
public class DeseneGoreMethod {

    public static int DeseneGoreMethod(int n,int tmp, int x){
        System.out.print(n+" ");

        if (x==1){
            n += 5;
        }else {
            n -= 5;
            if (n<=0){
                x *= -1;
            }
        }
        if (n==tmp){
            System.out.print(n);
            return 0;
        }

        return DeseneGoreMethod(n,tmp,x);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("N Sayısı : ");
        n = scanner.nextInt();

        if (n<=0){
            System.out.println("Pozitif bir sayı giriniz !!");
            System.exit(1);
        }else {
            DeseneGoreMethod(n,n,-1);
        }


    }
}
  /*  Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
        Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
   */