package com.example.my.design.pattern;

public class FactoryChildClassFirst extends FactorySuperClass {
    private String name;

    public FactoryChildClassFirst(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
