package org.example;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new BlackCoffee();
        beverage = new Soy(beverage);
        beverage = new Sugar(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
