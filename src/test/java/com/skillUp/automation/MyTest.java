package com.skillUp.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyTest extends TestRunner {
    WebDriver driver;

    @Test
    public void test2() {

        driver.get(URL);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "title is wrong");

        //Assert.assertTrue(driver.findElement(By.id("scpl1")).click();
        //System.out.print("This is search2 element");


    }
}
