/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

import java.util.List;

public abstract class Beverage {

    private String description;

    protected abstract int cost();

    private List<Condiment> condiments;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

    public void setCondiments(List<Condiment> condiments) {
        this.condiments = condiments;
    }
}
