package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mockStatic;


@ExtendWith(MockitoExtension.class)
class SomeClassTest {

    static MockedStatic<DbFactory> dbFactoryMockStatic;


    @BeforeEach
    public void setup(){
        DbService myDev = new DevDbServiceImpl();
        dbFactoryMockStatic = mockStatic(DbFactory.class);
        dbFactoryMockStatic.when(DbFactory::getDB).thenReturn(myDev);
    }

    @Test
    void getDbName() {
        SomeClass sm = new SomeClass();
        System.out.println(sm.getDbName());
    }
}