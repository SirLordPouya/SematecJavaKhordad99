package com.sematec.lib;

public class TestChildAbstract extends TestAbstractClass {
    @Override
    public void saveData() {
        openDataBaseConnection();
        //
        //
        //
        closeDataBaseConnection();
    }
}
