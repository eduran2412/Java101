    import java.util.Scanner;
    public class NotOrtalamasi {
        public static void main(String[] args) {
            int mat, fiz, kim,tur, tar, muz;
            Scanner input = new Scanner(System.in);
            System.out.print("Matematik ortalaması :");
            mat = input.nextInt();
            System.out.print("Fizik ortalaması :");
            fiz = input.nextInt();
            System.out.print("Kimya ortalaması :");
            kim = input.nextInt();
            System.out.print("Türkçe ortalaması :");
            tur = input.nextInt();
            System.out.print("Tarih ortalaması :");
            tar = input.nextInt();
            System.out.print("Müzik ortalaması :");
            muz = input.nextInt();

            double toplam = (mat +fiz +kim +tur +tar +muz);
            double sonuc = toplam/6;
            System.out.println("Bütün Notların ortalama değeri :" +sonuc);

            String durum = (sonuc>60)? "Sınıfı Geçti":"Sınıfta Kaldı";
            System.out.println("Sınıfı Geçip Geçmeme Durumu :" +durum);

        }
    }

