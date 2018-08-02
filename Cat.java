package cats;

public class Cat {
    private String name;
    private boolean full;

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }


    public Cat(String name) {
        this.name = name;
    }

        public void eat (Plate p){
        if (p.decFood(30)) {
            System.out.println(name + " eat");
            full = true;
            System.out.println( name + "FUL: " + full);
        } else {
            System.out.println(name + " no eat");
            System.out.println(name + "FUL: " + full);
        }

    }

}
