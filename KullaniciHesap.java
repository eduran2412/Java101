
import java.util.Scanner;

public class KullaniciHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String userName, password, nPassword;
        int select;

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
        userName = input.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı..");
        } else {
            if (userName.equals("patika")) {

                System.out.println("Şifre Hatalı");
                System.out.print("Şifrenizi Sıfırlamak İster misiniz ?\nCevabınız Evet ise 1'e Hayır ise 2'ye basınız : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Yeni Şifrenizi Giriniz : ");
                        nPassword = scanner.nextLine();

                        if (nPassword.equals("java123") || nPassword.equals(password)) {
                            System.out.println("Şifre Oluşturulamadı! Lütfen Başka Şifre Deneyiniz..");
                        } else {
                            System.out.println("Yeni Şifre Oluşturuldu.");
                        }
                        break;

                    case 2:
                        System.out.println("Lütfen Şifrenizi Kontrol Edip Tekrar Deneyiniz!");
                        break;

                    default:
                        System.out.println("Lütfen geçerli bir seçim yapınız!");
                        break;

                }


            } else if (password.equals("java123")) {
                System.out.println("Kullanıcı Adı Yanlış!\nTekrar Deneyiniz!");
            }

        }
    }
}
//Ödev Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin
// hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz.
// " sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.