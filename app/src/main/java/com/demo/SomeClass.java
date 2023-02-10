package com.demo;

public class SomeClass {

    public String getDbName(){
        return DbFactory.getDB().getName();
    }
}
