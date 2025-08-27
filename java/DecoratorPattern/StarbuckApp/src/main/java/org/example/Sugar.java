/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class Sugar extends Condiment {

    public Sugar() {
        this.setDescription("I'm sugar condiment!");
    }

    @Override
    protected int cost() {
        return 5;
    }
}
