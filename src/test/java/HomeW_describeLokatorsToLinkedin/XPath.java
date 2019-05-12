package HomeW_describeLokatorsToLinkedin;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class XPath {
    ChromeDriver driver;
            @BeforeSuite
            public void beforeMetod() {
                String property = System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", property);
                driver = new ChromeDriver();
            System.out.println("start beforeMetod");
            driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            }
            @BeforeMethod
            public void befMetod(){

            }
            @AfterMethod
            public void afterMetod() throws InterruptedException {
                Thread.sleep(3000);
                //driver.quit();
            }
            @AfterSuite
            public void afterClass() {
            driver.quit();

    }
}
