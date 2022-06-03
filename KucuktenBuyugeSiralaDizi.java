import java.util.Arrays;
import java.util.Scanner;

public class KucuktenBuyugeSiralaDizi {
    public static void main(String[] args) {
        // Dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Gecersiz bir boyut girdiniz");

        } else {

            int list[] = new int[n];
            System.out.println("Dizinin elemanlarını giriniz : ");
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Elemanı : ");
                int val = scanner.nextInt();
                list[i] = val;
            }
            Arrays.sort(list);

         //   System.out.println(Arrays.toString(list));
            System.out.print("Sıralama : ");
            for (int val : list){
                System.out.print(val+" ");
            }


        }


    }
}
