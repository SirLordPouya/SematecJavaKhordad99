package com.sematec.lib;

public class Teachers implements TestInterface {
    @Override
    public void printName(String name) {
        System.out.println("Mr/Ms " + name);
    }

    @Override
    public void calculateAge(int birthYear) {
        System.out.println("Your age is: " + (2020 - birthYear));
    }
}
