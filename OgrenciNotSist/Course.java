package OgrenciNotSist;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNot;

    Course(String name,String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNot = 0;

    }
    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve dersin bölümleri uyuşmuyor");
        }

    }

    public void printTeacher(){
        this.teacher.print();
    }
}
