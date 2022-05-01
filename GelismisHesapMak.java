import java.util.Scanner;
public class GelismisHesapMak {
    static void plus() {
        Scanner scanner=new Scanner(System.in);
        int number,result=0,i=1;
        System.out.println("0 Seçene kadar sizden sayı istenir..");
        while (true){
            System.out.print(i++ +". Sayı : ");
            number = scanner.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.print("Sonuç : "+result);
    }
    static void minus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scanner.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void times(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 1,counter;

        System.out.print("Kaç adet sayı gireceksiniz :");
        counter = scanner.nextInt();
        for (int i=1; i<=counter;i++){
            System.out.print(i +". Sayı : ");
            number = scanner.nextInt();
            if (number==0){
                result=0;
            }
            result *=number;
        }
        System.out.print("Çarpımın Sonucu : "+result);
    }
    static void divided(){
        Scanner scanner = new Scanner(System.in);
        int number;
        double result=0.0, counter;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        counter=scanner.nextDouble();

        for(int i=1;i<=counter;i++){
            System.out.print(i +". Sayı : ");
            number=scanner.nextInt();
            if (i != 1 && number==0){
                System.out.println("Böleni 0 giremezsiniz..");
                i--;
                continue;
            }
            if (i==1){
                result=number;
            }
            result/=number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scanner.nextInt();
        int result=1;
        for (int i=1; i<=exponent;i++){
            result *=base;
        }
        System.out.println("Üs alma işlem sonucu :"+result);
    }

    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int number,result=1;
        System.out.print("Faktöriyeli alınacak sayıyı giriniz : ");
        number = scanner.nextInt();
       for (int i=1; i<=number; i++){
           result *= i;
       }
        System.out.println("Sonuç : "+result);
    }
    static void mode(){
        Scanner scanner = new Scanner(System.in);
        int number,result = 0;
        System.out.print("Modunu almak istediğiniz sayıyı giriniz : ");
        int mode1 = scanner.nextInt();
        System.out.print("Mod alacak sayıyı giriniz : ");
        int mode2 = scanner.nextInt();
        if (mode2==0){
            System.out.println("Mod alacak sayı sıfırdan farklı olmalıdır..");
        }else{
            result = mode1 % mode2;
            System.out.println("Sonuç : "+result);
        }
    }
    static void variance(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,circumference,area,select;
        System.out.print("Birinci kenar : ");
        num1 = scanner.nextInt();
        System.out.print("İkinci kenar :");
        num2 = scanner.nextInt();
        area = num1*num2;
        circumference = 2*(num1+num2);
        System.out.print("Alan hesabı için 1, Çevre hesabı için 2' yi seçiniz : ");
        select = scanner.nextInt();
        if(select==1){
            System.out.println("Dikdörtgenin alanı : "+area);
        }else if (select==2){
            System.out.println("Dikdörtgenin çevresi : "+circumference);
        }else {
            System.out.println("Geçerli bir seçim yapınız!!");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu =
                 "1-Toplama işlemi\n"
                +"2-Çıkarma İşlemi\n"
                +"3-Çarmpa İşlemi\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Faktöriyel Hesaplama\n"
                +"7-Mod Alma\n"
                +"8-Dikdörtgen Alan Ve Çevre Hesabı\n"
                +"0-Çıkış Yap";

        System.out.println(menu);
        do {
            System.out.print("\nBir İşlem Seçiniz : ");
            select=scanner.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    variance();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış Giriş Yaptınız..");
            }

        }while (select!=0);
    }

}
