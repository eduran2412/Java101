public class DiziYildizBYazma {
    public static void main(String[] args) {

        // Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.


        String[][] let = new String[7][4];

        for (int i = 0; i<let.length; i++){
            for (int j = 0; j<let[i].length; j++){
                if (i==0 || i==3 || i==6){
                    let[i][j] = " * ";
                }else if (j==0 || j==3){
                    let[i][j] = " * ";
                }else {
                    let[i][j] = "   ";
                }
            }
        }

        for (int i = 0; i<let.length; i++){
            for (int j =0; j<let[i].length; j++){
                System.out.print(let[i][j]);
            }
            System.out.println();
        }





        /*

        A harfi yazdırma

        String[][] letter = new String[6][4];

        for (int i = 0; i<letter.length; i++){
            for (int j = 0; j<letter[i].length; j++){
                if (i == 0 || i == 2){
                    letter[i][j] = " * ";
                }else if (j == 0 || j == 3){
                    letter[i][j] = " * ";
                }else{
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col:row) {
                System.out.print(col);
            }
            System.out.println();
        }                                    */


    }
}
