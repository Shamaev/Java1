package cats;

import cats.Cat;
import cats.Plate;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat ("Barsic"),
                new Cat ("Igor"),
                new Cat ("Tolya"),
                new Cat ("Persic"),
                new Cat ("Bodya"),
        };
        Cat cat2 = new Cat ("Barsic2");
        Plate plate1 = new Plate (100);

        for (Cat o : cats) {
            o.eat(plate1);
        }

        plate1.info();
        plate1.foodPlus(30);
    }
}
