package com.sematec.lib;

public class TestSwitch {

    public static void main(String[] args) {
        int userInput = 10;

        switch (userInput) {
            case 0:
                System.out.println("the input is zero");
                break;
            case 1:
                System.out.println("the input is one");
                break;
            case 2:
                System.out.println("the input is two");
                break;
            case 3:
                System.out.println("the input is three");
                break;
            case 4:
                System.out.println("the input is four");
                break;
            default:
                System.out.println("Please enter a number in 0 to 4 range");

        }
    }
}
