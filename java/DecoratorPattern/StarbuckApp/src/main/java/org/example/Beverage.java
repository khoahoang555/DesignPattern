/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public abstract class Beverage {

    String description;

    protected abstract int cost();

    public String getDescription() {
        return description;
    }
}
