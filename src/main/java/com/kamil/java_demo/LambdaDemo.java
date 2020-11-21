package com.kamil.java_demo;

import java.util.stream.Stream;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("From MyRunnable class");
    }
}

interface MyInterface {
    void justDoIt();
}

@FunctionalInterface
interface StringToInt {
    int nameLength(String name);
    default int nameAndSurnameLength(String name) {
        return -1;
    }
}
public class LambdaDemo {

    public static void main(String[] args) {
        Runnable job = new MyRunnable();
        job.run();


        Runnable job3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("From anonymous Runnable");
            }
        };
        job3.run();

        Runnable job2 = () -> {
            System.out.println("Hello from Runnable lambda");
        };


        MyInterface nike = new MyInterface() {
            @Override
            public void justDoIt() {

            }
        };

        MyInterface nike2 = () -> {
            System.out.println("from nike2");
        };
        nike2.justDoIt();

        StringToInt stringToInt = name -> name.length();
        System.out.println(stringToInt.nameLength("Kamil"));

        Stream<Object> objects = Stream.of("mariusz", "marek", "adrianna", "zenon", "rysiek", "halina");
        Stream<String> names = Stream.of("mariusz", "marek", "adrianna", "zenon", "rysiek", "halina");


        names.filter(name -> name.length() > 6)
                .map(s -> s.length())
                .forEach(x -> System.out.println(x));




    }

}
