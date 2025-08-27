/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    // Hold to handle case unregister to subject
    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
