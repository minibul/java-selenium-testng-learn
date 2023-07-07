package tests.base;

import common.CommonAction;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realthome.RealtHomePage;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

    @AfterSuite(alwaysRun = true)
    public void quite () {
        driver.quit();
    }

}
