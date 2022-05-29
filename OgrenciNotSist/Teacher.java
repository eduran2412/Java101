package OgrenciNotSist;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Adı \t : "+this.name);
        System.out.println("Numarası : "+this.mpno);
        System.out.println("Branşı \t : "+this.branch);
    }
}
