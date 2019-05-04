package com.skillUp.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRunner {
    ChromeDriver driver;

    @BeforeSuite
    private void beforeSuite() {
        System.out.print("Before");
    }

    @BeforeClass
    public void beforeClass() {

        System.out.print("BefClass");


            String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", property);
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }

    @BeforeMethod
    public void beforeMetod() {
        driver.get("http://www.bing.com");
    }


    @AfterClass
    public void afterClass() {
        System.out.print("AfterClass");
        driver.quit();
    }


    @AfterSuite
    public void afterSuite() {
        System.out.print("AfterSuite");
    }
}
