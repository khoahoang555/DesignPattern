/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
