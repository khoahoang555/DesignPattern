/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected int cost() {
        return this.beverage.cost() + 2;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
