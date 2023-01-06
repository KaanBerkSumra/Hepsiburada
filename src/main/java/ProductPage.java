import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public static String productName;

    public void selectProduct(){
        getElementFromList(By.cssSelector("li[class='productListContent-zAP0Y5msy8OHn5z7T_K_']"),0).click();
        windowHandle();
    }
    public void getNameOfProduct(){
        productName = getText(By.id("product-name"));
    }
    public void addToBasket() throws InterruptedException {
        clickElement(By.cssSelector("button[class='button big with-icon']"));
        Thread.sleep(2000);
        getElementFromList(By.cssSelector("button[class='add-to-basket button small']"),0).click();
        logger.info("Items were added.");
    }
    public void goToBasket() throws InterruptedException {
        clickElement(By.xpath("//*[contains(text(),'Sepetim')]"));
        Thread.sleep(2000);
        logger.info("Basket page was opened.");
    }
}
