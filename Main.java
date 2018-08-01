package ru.Shamaev.hw6.Animals;

import ru.Shamaev.hw6.Animals.Animal.*;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", "Стёпа", 200, 0, 2);
        Dog dog = new Dog("Пёс", "Филип", 500, 10, 0.5);

        cat.run(250);
        cat.swim(5);
        cat.jump(15);

        System.out.println();

        dog.run(550);
        dog.swim(33);
        dog.jump(0.5);
    }
}
