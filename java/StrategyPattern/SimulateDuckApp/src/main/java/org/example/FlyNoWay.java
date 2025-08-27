/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
