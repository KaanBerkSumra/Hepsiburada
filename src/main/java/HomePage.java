import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    public HomePage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void navigateToWebsite(){
        goToUrl("https://www.hepsiburada.com/");
        logger.info("Navigated to Hepsiburada.");
    }
    public void acceptCookies(){
        clickElement(By.id("onetrust-accept-btn-handler"));
        logger.info("Cookies accepted.");
    }
    public void navigateToLoginPage(){
        hoverElement(By.id("myAccount"));
        clickElement(By.id("login"));
        logger.info("Navigated to Login Page.");
    }
    public void verifyLogin(){
        String userName = "Kaan Test";
        Assert.assertEquals("Login Failed!", userName, getText(By.cssSelector("span[class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR']")));
        logger.info("Login verified.");
    }
    public void searchBox(){
        sendKeys(By.cssSelector("input[class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"), "iphone 14" + Keys.ENTER);
    }
}


