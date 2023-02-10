package com.demo;

public class DbFactory {

    public static DbService getDB() {
        return DbServiceImpl.getInstance();
    }
}
