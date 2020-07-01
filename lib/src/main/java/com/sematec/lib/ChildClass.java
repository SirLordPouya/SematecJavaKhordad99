package com.sematec.lib;

public class ChildClass extends ParentClass {


    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printFullName() {
        System.out.println("Hello " + name + " " + family);
    }
}
