package Maas;

public class Employee {
    String name; // ad
    double salary; // maaş
    int workHours; // haftalık çalışma saati
    int hireYear; // işe başlangıç yılı

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){ // maaşa uygulanan vergi
      /*  Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır. */

        if (this.salary < 1000){
            return salary;
        }else {
            double tax = salary * 0.03;
            return tax;
        }


    }

    public int bonus(){//  Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        if (workHours > 40){
            int bonus = (workHours - 40)*30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary(){
        /*Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır. */

        if (hireYear<=0 || hireYear>2021){
            System.out.println("Geçersiz bir çalışma yılı girdiniz, tekrar kontrol ediniz!");

        }else {
            int farkYil = 2021 - hireYear;
            double zam;

            if (farkYil>0 &&farkYil < 10){
                zam =  salary * 0.05;
                return zam;
            }else if (farkYil>9 && farkYil<20){
                zam = salary * 0.1;
                return zam;
            }else if (farkYil>19){
                zam = salary * 0.15;
                return  zam;
            }else if (farkYil == 0 ){
                return 0;
            }
        }

        return 0;
    }


    public String toString(){ //Çalışana ait bilgileri ekrana bastıracaktır.

        double total = salary -tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);


        return null;
    }
}