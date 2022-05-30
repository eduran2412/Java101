import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n, k, total=1;

        System.out.print("Üssü alınacak sayı : ");
        n = scanner.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = scanner.nextInt();

        for(int i=1; i<=k; i++){
            total *= n;
        }

        System.out.println("İşlemin sonucu : "+total);
    }
}
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
