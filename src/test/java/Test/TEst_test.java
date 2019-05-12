package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TEst_test extends TestRun {
    private static final String EXPECTED_TITLE = "Google";
    private static final String URL = "https://www.google.com";
    private static final String EXPECTED_URL = "google.com";

    @Test
    public void myTest() {
        driver.get(URL);
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, EXPECTED_TITLE, "SITE TITLE IS WRONG");
    }

    @Test
    public void myTest2() {
        driver.get(URL);
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(EXPECTED_URL),
                String.format("SITE URL IS WRONG, " +
                        "actual url: %s, expected part: %s", actualUrl, EXPECTED_URL));
        System.out.println("myTest2 is finished");

    }

    /*@Test
    public void myTest3() {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);

        driver.findElement(By.xpath(LocatorsClass.SEARCH_INPUT)).sendKeys("My group is best");
        driver.findElement(By.xpath(LocatorsClass.GOOGLE_BUTTON)).click();
    }
    */
}
