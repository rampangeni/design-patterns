package com.example.my.design.pattern.creational.factory;

public class FactoryDesignPattern {
    public  static FactorySuperClass getChildClass (String type, String name) {
        if ("FIRST".equalsIgnoreCase(type)) {
            return new FactoryChildClassFirst(name);
        } else if ("SECOND".equalsIgnoreCase(type)) {
            return new FactoryChildClassSecond(name);
        } else {
            return null;
        }
    }
}
