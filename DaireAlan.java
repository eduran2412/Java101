
import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r,a;
        double pi=3.14, alan;

        System.out.print("Dairenin Yarıçapını Giriniz :");
        r = scanner.nextInt();
        System.out.print("Merkez Açı Değerini Giriniz :");
        a = scanner.nextInt();

        alan =(pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı :" +alan);





    }
}
//Ödev Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360