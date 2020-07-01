package com.sematec.lib;

public class Person extends ParentClass implements TestInterface,HelloInterface {
    @Override
    public void printName(String name) {
        System.out.println(name);
    }

    @Override
    public void calculateAge(int birthYear) {
        System.out.println(2020 - birthYear);
    }

    @Override
    public void printHello() {
        System.out.println("Hello");
    }
}
