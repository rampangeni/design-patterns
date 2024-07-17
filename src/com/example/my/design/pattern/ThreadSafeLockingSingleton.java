package com.example.my.design.pattern;

public class ThreadSafeLockingSingleton {
    private static ThreadSafeLockingSingleton instance;

    private ThreadSafeLockingSingleton() {
        System.out.println("My ThreadSafeLockingSingleton instance\n");
    }

    public static ThreadSafeLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeLockingSingleton();
                }
            }
        }

        return instance;
    }
}
