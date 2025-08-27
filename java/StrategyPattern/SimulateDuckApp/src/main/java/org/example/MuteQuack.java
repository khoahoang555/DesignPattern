/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
