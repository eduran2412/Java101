public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    Boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }



    public void addBulkExamNote(int note1,int note2,int note3, int sNote1,int sNote2, int sNote3){
        if ((note1 >= 0 && note1<=100) && (sNote1 >= 0 && sNote1 <= 100)){
            this.c1.note = note1;
        }
        if ((note2 >= 0 && note2 <= 100) && (sNote2 >=0 && sNote2 <= 100)){
            this.c2.note = note2;
        }
        if ((note3 >= 0 && note3 <= 100) && (sNote3 >= 0 && sNote3 <= 100)){
            this.c3.note = note3;
        }
    }

    public void calcAverage(){
        double n1 = (this.c1.note*0.8 + this.c1.sozluNot*0.2);
        double n2 = (this.c2.note*0.7 + this.c2.sozluNot*0.3);
        double n3 = (this.c3.note*0.6 + this.c3.sozluNot*0.4);
        this.average = (n1 + n2 + n3)/3;
    }


    public void printNote(){
        System.out.println("Öğrencinin ortalaması :"+this.average);
        System.out.println();
        System.out.println(c1.name +" \t dersi notu : "+c1.note);
        System.out.println(c2.name +" \t dersi notu : "+c2.note);
        System.out.println(c3.name +" dersi notu : "+c3.note);
    }

    public void isPass(){
        calcAverage();
        if (this.average>55){
            System.out.println(this.name+" isimli öğrenci sınıfı geçti");
            this.isPass = true;
        }else {
            System.out.println(this.name+" isimli öğrenci sınıfı geçemedi");
            this.isPass = false;
        }
        printNote();
    }

}
