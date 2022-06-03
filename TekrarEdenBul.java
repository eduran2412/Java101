import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;

public class TekrarEdenBul {
    // Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program

    static boolean isFind(int[] ar, int val) {
        for (int i : ar) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 2, 3, 3, 2, 4, 2, 22, 8, 33, 4, 8};
        int[] dupliacate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(dupliacate, list[i])) {
                        dupliacate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

      /*
        for (int i : dupliacate) {
            if (i != 0) {
                System.out.print(i);
            }
        }  */

        int[] lst1 = new int[startIndex];

        for (int j : dupliacate){
            for (int k = 0; k<startIndex; k++){
                lst1[k] = dupliacate[k];
            }
        }
        System.out.println(Arrays.toString(lst1));

    }




    /* Tekrar edeni bulma

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if ((i != j) && list[i] == list[j]) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        int[] lst = new int[startIndex];

        for (int value : duplicate) {
            for (int i = 0; i< startIndex; i++) {
                    lst[i] = duplicate[i];
            }

        }
        System.out.println(Arrays.toString(lst));
  }       */
}
