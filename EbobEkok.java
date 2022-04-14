import java.util.Scanner;
public class EbobEkok {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1, num2,ebob=1,ekok=1,select;

        System.out.print("Birinci Sayıyı Giriniz : ");
        num1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = scanner.nextInt();
        System.out.print("Ebob İçin 1'i Ekok İçin 2'yi seçiniz : ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                if (num1 > num2){
                    for (int i=1; i<=num2; i++){ // küçükten büyüğe doğru sayım
                        if (num1 % i == 0 && num2 % i == 0){
                            ebob = i;
                        }

                    }System.out.println("Sayıların Ebob'u " +ebob);
                }else if (num2 > num1){
                    for (int j=num1; j>0; j--){ // büyükten küçüğe doğru sayım
                        if (num1 % j == 0 && num2 % j == 0){
                            ebob = j;
                            break;
                        }
                    }System.out.println("Sayıların Ebob'u "+ ebob);
                }else if (num1 == num2){
                    System.out.println("Sayılar eşit olduğu için sayıların Ebob'u "+num1);
                }
                break;
            case 2:
                for (int k = 1; k<=(num1*num2); k++){
                    if (k % num1 == 0 && k % num2 == 0){
                        ekok = k;
                        System.out.println("Sayıların Ekok'u "+ekok);
                        break;
                    }
                }

        }


    }

}
