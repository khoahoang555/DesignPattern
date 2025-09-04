/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class Soda extends Beverage {

    public Soda() {
        this.description = "Soda";
    }

    @Override
    protected int cost() {
        return 10;
    }
}
