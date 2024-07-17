package com.example.my.design.pattern;

public abstract class FactorySuperClass {
    public abstract String getName();

    @Override
    public String toString() {
        return "My AbstractDesignPattern instance - " + this.getName();
    }
}
