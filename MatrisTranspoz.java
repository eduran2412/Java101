public class MatrisTranspoz {
    public static void main(String[] args) {
        // çok boyutlu diziler ile oluşturulmuş matrisin transpozu

        /*
         *    matris[0][0] -----> transpoze[0][0]
         *    matris[0][1] -----> transpoze[1][0]
         *    matris[0][2] -----> transpoze[2][0]
         *    matris[1][0] -----> transpoze[0][1]
         *    matris[1][1] -----> transpoze[1][1]
         *    matris[1][2] -----> transpoze[2][1]
         *
         *
         *                       A   B              C  D
         *   A  00  01  02       00  10             00 01
         *   B  10  11  12       01  11             10 11
         *                       02  12             20 21                                             */


        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transpoze = new int[3][2];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                    transpoze[j][i] = matris[i][j];
            }
        }

        for (int i= 0; i<transpoze.length; i++){
            for (int j = 0; j<transpoze[i].length; j++){
                System.out.print(transpoze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
