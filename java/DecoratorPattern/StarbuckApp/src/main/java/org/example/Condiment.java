/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public abstract class Condiment {

    private String description;

    protected abstract int cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
