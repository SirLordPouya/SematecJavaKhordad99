package com.sematec.lib;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        System.out.println("Please enter your birth year:");

        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();

        int age = 2020 - birthYear;

        System.out.println("You age is: " + age);


    }
}
