
import java.util.Scanner;

public class Kuvvet {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n ;

        System.out.print("Bir sınır değer giriniz : ");
        n = scanner.nextInt();
        System.out.println("4'ün "+n +"'den küçük kuvvetleri : ");
        for(int i=1; i<n; i*=4){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("5'in "+n+"'den küçük kuvvetleri : ");
        for(int j=1; j<n; j*=5){
            System.out.print(j+",");
        }


    }
}

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.