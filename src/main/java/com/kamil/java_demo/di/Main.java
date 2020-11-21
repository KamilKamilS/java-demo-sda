package com.kamil.java_demo.di;

public class Main {

    public static void main(String[] args) {
        Engine small = new Engine(800);
        String color = "pink";

        Car myCar = new Car(small, color);
    }
}
