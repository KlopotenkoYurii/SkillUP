package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

    public class TestRun {
       public WebDriver driver = null;

        @BeforeSuite
        public void beforeSuite() {
            System.out.println("Before suite");
            WebDriverManager.chromedriver().setup();
        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before class");
        }

        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Before method");
            driver = new ChromeDriver();
        }

        @AfterMethod
        public void afterMethod() {
            System.out.println("After method");
            driver.quit();
        }

        @AfterClass
        public void afterClass() {
            System.out.println("After class");
        }

        @AfterSuite
        public void afterSuite() {
            System.out.println("After suite");
        }

    }

