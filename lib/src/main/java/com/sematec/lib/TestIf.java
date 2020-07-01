package com.sematec.lib;

public class TestIf {

    public static void main(String[] args) {

        int firstNumber = 30;
        int secondNumber = 30;
        boolean isMale = false;

        if (firstNumber > secondNumber) {
            System.out.println("First number is greater than second number");
        } else if (secondNumber > firstNumber) {
            System.out.println("Second number is greater than first number");
        } else {
            System.out.println("They are equals");
        }



        if (firstNumber > secondNumber || isMale == true){
            System.out.println("isMale is true");
        }

    }
}
