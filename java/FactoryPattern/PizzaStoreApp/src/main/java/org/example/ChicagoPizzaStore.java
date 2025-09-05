/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
