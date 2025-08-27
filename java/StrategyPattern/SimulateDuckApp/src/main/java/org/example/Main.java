package org.example;

public class Main {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        wildDuck.display();
        wildDuck.performFly();
        wildDuck.performQuack();

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
