package com.skillUp.automation;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public abstract class TestRunner {

    @BeforeSuite
    private void beforeSuite() {
        System.out.print("Before");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.print("BefClass");
    }


    @Test
    private void test(){
        System.out.print("Test");
    }


    @AfterClass
    public void afterClass(){
        System.out.print("AfterClass");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.print("AfterSuite");
    }
}
