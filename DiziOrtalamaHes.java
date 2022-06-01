public class DiziOrtalamaHes {
    public static void main(String[] args) {



        /* dizinin ortalamasını bulma
        int [] list = {1,2,3};
        double sum = 0.0;
        for (int i = 0; i<list.length; i++) {
            sum += list[i];
        }
        double average = sum / list.length;
        System.out.println(average); */


        
        int [] list = {1,2,3};
        double harmonikSeri = 0;

        for (int i = 1; i<=list.length; i++){
            harmonikSeri += ((double)1/i);
        }
        double average = list.length / harmonikSeri;


        System.out.println("Harmnik ortalama : "+average);


      /*  double[] arr={1,2,3};
        double sum=0;
        for(double i:arr){
            sum+=1/i;
        }
        double average= arr.length/sum;
        System.out.println("Harmonik ortalama: "+ average);    */

    }
}
//Ödev
//Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
//
//Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
//Harmonik seri =  1 + 1/2 + 1/3 + .... + 1/n