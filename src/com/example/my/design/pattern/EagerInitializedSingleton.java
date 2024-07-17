package com.example.my.design.pattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println("My EagerInitializedSingleton instance\n");
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
