/*
 * Copyright © 2025 GFIT Inc. All rights reserved.
 */
package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData () {
        this.observers = new ArrayList<>();
    }

    public void measurementChanged () {
        this.notifyToObservers(observers);
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyToObservers(List<Observer> observers) {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
