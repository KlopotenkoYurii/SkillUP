package com.skillUp.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.net.URL;
import java.rmi.ServerError;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TestRunner {
    ChromeDriver driver;

    @BeforeSuite
    private void beforeSuite() {
        System.out.println("Before_StartSuite");
    }

    @BeforeClass
    public void beforeClass() {

        System.out.println("BeforClass_StartClass");


        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://www.bing.com");
       // driver.get("http://www.google.com");
    }

    @Test
    public void test1(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Bing";
        assertEquals(expectedTitle, actualTitle);
        if (driver.getTitle().contains(expectedTitle))
            System.out.println("Name of tittle is correct! " + expectedTitle + " = " + actualTitle);
        else
            System.out.println("Title is not correct");
    }

    @Test
    public void test2(){
        String url = "https://www.bing.com/";
        System.out.println("URL: " + url);
        if (url.contains("/servererror/"))
            System.out.println("title is wrong");
        else
            System.out.println("URL does`nt contains error");
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        System.out.println("AfterClass_CloseDriver");
        //Thread.sleep(2000);
        driver.quit();
    }


    @AfterSuite
    public void afterSuite() {

        System.out.println("AfterSuite_ClosedSuite");
    }
}