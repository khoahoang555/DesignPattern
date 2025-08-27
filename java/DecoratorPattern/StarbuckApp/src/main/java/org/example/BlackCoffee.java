/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

import java.util.stream.Collectors;

public class BlackCoffee extends Beverage {

    public BlackCoffee() {
        this.setDescription("I'm black coffee!");
    }

    @Override
    protected int cost() {
        return 20;
    }
}
