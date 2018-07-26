package ru.shamaev.HW5;

import ru.shamaev.HW5.Worker;

public class MainClass {
    public static void main(String[] args) {


        Worker[] persArray = new Worker[5];
        persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231255", 30000, 30);
        persArray[1] = new Worker("Stepanov Dmitry", "Designer", "5648@mailbox.com", "89891256469", 24000, 22);
        persArray[2] = new Worker("Zhenya Nikitin", "Programmer", "ZH@mailbox.com", "89231200698", 60000, 43);
        persArray[3] = new Worker("Aleksandr Fomin", "Administrator", "boss@mailbox.com", "89236666666", 90000, 18);
        persArray[4] = new Worker("Svetlana Fokina", "Cleaner", "ivivan@mailbox.com", "89231231288", 12000, 60);

        for (int i = 0; i < persArray.length; i++) {
        if (persArray[i].getAge() >= 40) {
            persArray[i].info();
        }
    }
    }
}
