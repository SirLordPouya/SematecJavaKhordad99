package com.sematec.lib;

public class Students {
    private String name;
    private String family;
    private String fatherName;
    private int age;
    private String nCode;
    private boolean isActive;

    public Students(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public Students(String name, String family, String fatherName, int age, String nCode, boolean isActive) {
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.age = age;
        this.nCode = nCode;
        this.isActive = isActive;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getnCode() {
        return nCode;
    }

    public void setnCode(String nCode) {
        this.nCode = nCode;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

}
