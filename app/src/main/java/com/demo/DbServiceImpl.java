package com.demo;

public class DbServiceImpl implements DbService {

    private static DbService dbSvc = new DbServiceImpl("PROD");

    private String dbName;

    protected DbServiceImpl(String dbName){
        this.dbName = dbName;
    }

    public static DbService getInstance(){
        return dbSvc;
    }
    @Override
    public String getName() {
        return this.dbName;
    }
}
