import java.util.Scanner;
public class Atm1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String userName, password;
        int right = 3, select;
        double balance = 1500;


        while (right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = scanner.nextLine();
            System.out.print("Parolanızı Giriniz : ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Patika Bankasına Hoşgeldiniz..");

                do {
                    System.out.println();
                    System.out.print("1-Para Yatırma:\n" +
                            "2-Para Çekme:\n" +
                            "3-Bakiye Sorma:\n" +
                            "4-Çıkış:\n");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = scanner.nextInt();
                    System.out.println("--------------              --------------");
                    if (select == 1){
                        System.out.print("\nYatırmak İstediğiniz Miktarı Giriniz : ");
                        int price = scanner.nextInt();
                        balance += price;
                        System.out.println("\nPara yatırma işleminiz başarıyla gerçekleşti..");
                        System.out.println();
                    }else if (select == 2){
                        System.out.print("\nÇekmek İstediğiniz Miktarı Giriniz : ");
                        int price = scanner.nextInt();
                        if (price > balance){
                            System.out.println("\nBakiye Yetersiz!!\n");
                        }else {
                            System.out.println("\nPara çekme işleminiz başarıyla gerçekleşti..");
                            balance -= price;
                        }
                    }else if (select == 3){
                        System.out.println("\nBakiyeniz "+balance+" tl dir.\n");
                    }

                }while (select != 4);
                System.out.println("Çıkış yapılıyor...\nTekrar Görüşmek Üzere..");
                break;
            }else{
                right--;

                if (right==0){
                    System.out.println("\nHesabınız Bloke Olmuştur. Lütfen Banka İle Görüşünüz!!");
                }else {
                    System.out.println("\nHatalı Kullanıcı Adı Veya Şifre. Tekrar Deneyiniz!!\nKalan Hakkınız : "+right);
                }

            }

        }





    }
}