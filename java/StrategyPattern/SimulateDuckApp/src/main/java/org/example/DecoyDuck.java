/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
