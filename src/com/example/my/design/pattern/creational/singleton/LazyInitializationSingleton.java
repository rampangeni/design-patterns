package com.example.my.design.pattern.creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
        System.out.println("My LazyInitializationSingleton instance\n");
    }

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }

        return instance;
    }
}
