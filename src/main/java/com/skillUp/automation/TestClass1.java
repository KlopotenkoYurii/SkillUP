package com.skillUp.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass1 {
    private static final String EXPECTED_TITLE = "Google";
    private static final String URL = "https://www.google.com";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.operadriver();

        String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.google.com");
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        if (EXPECTED_TITLE.equals(actualtitle)) {
            System.out.println("Hey");
        } else {
            System.out.println("Say fall");

            /*
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("SkillUp");
        Thread.sleep(2000);
        driver.findElements(By.name("btnK"));
*/
            driver.quit();
        }
    }
}
