package com.example.my.design.pattern;

public class FactoryChildClassSecond extends FactorySuperClass {
    private String name;

    public FactoryChildClassSecond(String name) { this.name = name; }

    @Override
    public String getName() {
        return this.name;
    }
}
