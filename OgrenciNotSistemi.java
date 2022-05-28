public class OgrenciNotSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahmet","1111","TRH");
        Teacher t2 = new Teacher("Veli","2222","FZK");
        Teacher t3 = new Teacher("Ali","333","BIO");


        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);


        Student s1 = new Student("Şaban","123","4",tarih,fizik,bio);
        Student s2 = new Student("Necmi","456","4",tarih,fizik,bio);
        Student s3 = new Student("Ferit","789","4",tarih,fizik,bio);

        System.out.println("--------------------");
        s1.addBulkExamNote(100,70,70,100,100,100);
        s1.isPass();
        System.out.println("********************");
        System.out.println();

        System.out.println("--------------------");
        s2.addBulkExamNote(100,20,55,80,90,100);
        s2.isPass();
        System.out.println("********************");
        System.out.println();

        System.out.println("--------------------");
        s3.addBulkExamNote(90,80,75,90,90,90);
        s3.isPass();
        System.out.println("********************");






    }
}
