/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class WildDuck extends Duck {

    public WildDuck() {
        this.setFlyBehavior(new FlyWithWing());
        this.setQuackBehavior(new Quack());
    }

    @Override
    void display() {
        System.out.println("I'm wild duck");
    }
}
