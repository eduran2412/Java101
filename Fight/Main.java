package Fight;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,100,100,50);
        Fighter f2 = new Fighter("B",10,100,100,50);

        Ring ring = new Ring(f1,f2,85,100);
        ring.run();

    }
}
