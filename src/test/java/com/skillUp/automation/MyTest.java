package com.skillUp.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MyTest extends TestRunner {

    @Test
    public void test1() {
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
        System.out.println("Our URL: " + url);
        if (url.contains("/servererror/"))
            System.out.println("title is wrong");
        else
            System.out.println("URL does`nt contain error");
    }
}