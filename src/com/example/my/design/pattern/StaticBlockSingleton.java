package com.example.my.design.pattern;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
        System.out.println("My StaticBlockSingleton instance\n");
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured while creating StaticBlockSingleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
