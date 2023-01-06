import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void typeMail() throws InterruptedException {
        sendKeys(By.cssSelector("input[autocomplete='username']"), "kaan.berk23@gmail.com");
        clickElement(By.id("btnLogin"));
        Thread.sleep(2000);
        logger.info("Email was written.");
    }
    public void typePassword(){
        sendKeys(By.cssSelector("input[autocomplete='current-password']"), "Test1234");
        clickElement(By.id("btnEmailSelect"));
        logger.info("Password was written.");
    }

}
