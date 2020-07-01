package com.sematec.lib;

import java.util.ArrayList;

public class MyClass {

    String name = "Pouya";
    int age = 30;

    public static void main(String[] args) {
        String name = "";
        int year = 1890;
        int userAge = calculateAge(year);
        System.out.println(userAge);
        printName();
    }

    public static int calculateAge(int birthYear) {
        int thisYear = getYear();
        int age = thisYear - birthYear;
        return age;
    }

    public static int getYear() {
        int year = 2020;
        return year;
    }

    public static void printName() {
        String name = "Pouya Heydari";
        System.out.println(name);
    }

}