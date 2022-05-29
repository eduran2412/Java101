package Fight;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void run() {
        if (checkWeight()) {
            if (f1.isHit()){
                subRun(f1,f2);
            }else {
                subRun(f2,f1);
            }



        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor!");
        }
    }


    public boolean checkWeight() {

        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }


    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçın kazananı : " + f2.name);
            return true;
        }
        if (f2.health == 0) {
            System.out.println("Maçın kazananı : " + f1.name);
            return true;
        }
        return false;
    }


    public void printScore() {
        System.out.println("--->>>");
        System.out.println(this.f2.name + " kalan canı " + this.f2.health);
        System.out.println(this.f1.name + " kalan canı " + this.f1.health);
    }


    private void subRun(Fighter ilkVuran, Fighter ikinciVuran) {
        int round = 1;
        while (ilkVuran.health > 0 && ikinciVuran.health > 0) {


            System.out.println("===== "+round+". Round =====");


            ikinciVuran.health = ilkVuran.hit(ikinciVuran);

            if (isWin()) {
                break;
            }
            ilkVuran.health = ikinciVuran.hit(ilkVuran);
            if (isWin()) {
                break;
            }


            printScore();
            round++;
        }
    }
}
