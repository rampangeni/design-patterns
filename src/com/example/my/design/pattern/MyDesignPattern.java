package com.example.my.design.pattern;

import com.example.my.design.pattern.behavioral.observer.Observer;
import com.example.my.design.pattern.behavioral.observer.PhoneDisplayObserver;
import com.example.my.design.pattern.behavioral.observer.TVDisplayObserver;
import com.example.my.design.pattern.behavioral.observer.WeatherStationSubject;
import com.example.my.design.pattern.creational.builder.Student;
import com.example.my.design.pattern.creational.factory.FactoryDesignPattern;
import com.example.my.design.pattern.creational.factory.FactorySuperClass;
import com.example.my.design.pattern.creational.singleton.EagerInitializedSingleton;
import com.example.my.design.pattern.creational.singleton.LazyInitializationSingleton;
import com.example.my.design.pattern.creational.singleton.StaticBlockSingleton;
import com.example.my.design.pattern.creational.singleton.ThreadSafeLockingSingleton;
import com.example.my.design.pattern.creational.singleton.ThreadSafeSingleton;

public class MyDesignPattern {
    public static void main(String[] args) {

        System.out.println("***************************");
        System.out.println("CREATIONAL DESIGN PATTERNS");
        System.out.println("***************************");
        System.out.println("\n");

        System.out.println("SINGLETON DESIGN PATTERN");
        {
            System.out.println("1. EagerInitializedSingleton");
            EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

            System.out.println("2. StaticBlockSingleton");
            StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

            System.out.println("3. LazyInitializationSingleton");
            LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();

            System.out.println("4. ThreadSafeSingleton");
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

            System.out.println("5. ThreadSafeLockingSingleton");
            ThreadSafeLockingSingleton threadSafeLockingSingleton = ThreadSafeLockingSingleton.getInstance();
        }
        System.out.println("\n");

        System.out.println("FACTORY DESIGN PATTERN");
        {
            System.out.println("6. FactoryDesignPattern");
            FactorySuperClass first = FactoryDesignPattern.getChildClass("FIRST", "first");
            System.out.println(first);
            FactorySuperClass second = FactoryDesignPattern.getChildClass("SECOND", "second");
            System.out.println(second);
            FactorySuperClass third = FactoryDesignPattern.getChildClass("THIRD", "third");
            System.out.println(third);
        }
        System.out.println("\n");

        System.out.println("ABSTRACT FACTORY DESIGN PATTERN");
        {

        }
        System.out.println("\n");

        System.out.println("BUILDER DESIGN PATTERN");
        {
            System.out.println("7. BuilderDesignPattern");
            Student student = new Student.Builder()
                    .setFirstName("ram")
                    .setLastName("pangeni")
                    .setRollNumber(30)
                    .build();
            System.out.println(student);
        }
        System.out.println("\n");

        System.out.println("***************************");
        System.out.println("STRUCTURAL DESIGN PATTERNS");
        System.out.println("***************************");
        System.out.println("\n");

        System.out.println("***************************");
        System.out.println("BEHAVIORAL DESIGN PATTERNS");
        System.out.println("***************************");
        System.out.println("\n");

        System.out.println("OBSERVER DESIGN PATTERN");
        {
            System.out.println("1. ObserverDesignPattern");
            WeatherStationSubject weatherStation = new WeatherStationSubject();
            Observer phoneDisplay = new PhoneDisplayObserver();
            Observer tvDisplay = new TVDisplayObserver();
            weatherStation.addObserver(phoneDisplay);
            weatherStation.addObserver(tvDisplay);
            weatherStation.setWeather("Sunny");
        }
        System.out.println("\n");
    }
}
