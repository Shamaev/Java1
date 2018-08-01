package ru.Shamaev.hw6.Animals.Animal;

public class Animals {
    String type;
    String name;
    int maxRun;
    int maxSwim;
    double maxJump;

    public Animals(String type, String name, int maxRun, int maxSwim, double maxJump) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    public void run (int light){
        if (light <= maxRun) {
            System.out.println(name + " пробежал " + light + " метров");
        } else {
            System.out.println(name + " не сможет пробежать " + light + " метров. Максимум - " + maxRun);
        }
    }

      public void swim (int light) {
          if (maxSwim == 0) {
              System.out.println(name + " не умеет плавать");
              return;
          }
          if (light <= maxSwim) {
              System.out.println(name + " проплыл " + light + " метров");
          } else {
              System.out.println(name + " не сможет проплыть " + light + " метров. Максимум - " + maxSwim);
          }
      }

      public void jump (double height) {
          if (height <= maxJump) {
              System.out.println(name + " прыгнул на " + height + " метров");
          } else {
              System.out.println(name + " не сможет прыгнуть " + height + " метров. Максимум - " + maxJump);
          }
      }



}


