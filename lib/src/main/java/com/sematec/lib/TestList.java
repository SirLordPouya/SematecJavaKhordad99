package com.sematec.lib;

import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100); // 0
        list.add(5); // 1
        list.add(15); // 2
        list.add(1, 200);

        int result = list.get(1);

        System.out.println(result);


        ArrayList<String> names = new ArrayList<>();
        names.add("Pouya");
        names.add("Kaveh");
        names.add("Navid");
        names.add("Maryam");
        names.add("Ali");


        String name = names.get(4);
        System.out.println(name);


        int size = names.size();
        System.out.println(size);


        for (int i = 0; i < names.size(); i++) {
            String n = names.get(i);
            System.out.println(n);
        }



    }
}
