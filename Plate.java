package cats;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decFood (int dose) {
        if (food >= dose) {
            food -= dose;
            return true;
        } else {
            return false;
        }
    }

    public void foodPlus (int dose) {
        food += dose;
        System.out.println("Food: " + food);
    }

    public void info () {
        System.out.println("Food: " + food);
    }
}
