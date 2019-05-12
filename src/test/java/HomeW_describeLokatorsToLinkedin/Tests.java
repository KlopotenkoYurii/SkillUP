package HomeW_describeLokatorsToLinkedin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tests extends XPath {

    @Test
    public void test11(){
        driver.get("https://www.linkedin.com/start/join?trk=guest_homepage-basic_nav-header-join");

        driver.findElement(By.xpath(LocatorClass.FirstName)).sendKeys("Irina");
        driver.findElement(By.xpath(LocatorClass.SecondName)).sendKeys("Pupsic");
        driver.findElement(By.cssSelector(LocatorClass.Email)).sendKeys("pupsic@gmail.com");
        driver.findElement(By.cssSelector(LocatorClass.Passvord)).sendKeys("123456789");
    }
    @Test
    public void test22(){
        driver.get("https://www.linkedin.com/uas/login");

        driver.findElement(By.xpath(LocatorClass.UserName)).sendKeys("Zhopka");
        driver.findElement(By.cssSelector(LocatorClass.Pass)).sendKeys("Pupsika");
    }
}
