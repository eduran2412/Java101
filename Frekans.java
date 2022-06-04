import javax.naming.PartialResultException;
import java.util.Arrays;

public class Frekans {
    /* Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
    Senaryo
      Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
      Tekrar Sayıları
      10 sayısı 3 kere tekrar edildi.
      20 sayısı 4 kere tekrar edildi.
      5 sayısı 1 kere tekrar edildi.  */


    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] count = new int[list.length];

        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            count[i] = 1;
        }


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    list[j] = 0;
                }
            }
        }


        System.out.println("Tekrar Sayıları");
        for (int k = 0; k < list.length; k++) {
            if (list[k] != 0) {
                System.out.println(list[k] + " sayısı " + count[k] + " kere tekrar edildi.");
            }
        }


    }
}
