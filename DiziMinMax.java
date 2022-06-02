import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;
//ödev
// Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
//
//Dizi : {15,12,788,1,-1,-778,2,0}
//Girilen Sayı : 5
//Girilen sayıdan küçük en yakın sayı : 2
//Girilen sayıdan büyük en yakın sayı : 12

public class DiziMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : "+Arrays.toString(list));
        System.out.print("Girilen Sayı :");
        int value = scanner.nextInt();

        int onceki = list[0];
        int sonraki = list[0];
        Arrays.sort(list);

        for (int i: list){
            if (value>i){
                onceki = i;
            }
            if (value<i){
                sonraki =i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ onceki);
        System.out.println("Girilen sayıdan büyük en yakın sayı "+sonraki);




        /* dizide maax ve min bulma
        int[] list = {2,-1,46,77,100,22,4};
        int min = list[0];
        int max = list[0];

        for (int i : list){
            if (i<min ){
                min = i;
            }
            if (i>max){
                max = i;
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max); */
    }
}


