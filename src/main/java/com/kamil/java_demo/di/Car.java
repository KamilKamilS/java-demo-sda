package com.kamil.java_demo.di;

public class Car {


    private Engine engine;
    private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
