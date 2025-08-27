/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am quacking!");
    }
}
