package com.sematec.lib;

public class TestObject {

    public static void main(String[] args) {

        Students student = new Students("Ali", "Alizade", "Qoli", 30, "1234567890", true);
        student.setName("Alireza");

        Students student1 = new Students("Mamad", "MamadPour", "Zakaria", 29, "1234567890", false);

        Students student2 = new Students("","",10);

        String name = student.getFatherName();
        System.out.println(name);


        String fatherName = student1.getFatherName();
        System.out.println(fatherName);
    }
}
