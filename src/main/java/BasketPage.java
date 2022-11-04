import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
    public BasketPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }
    ProductPage productPage = new ProductPage(driver,logger);

    public void checkProductNames(){
        String firstProduct = getElementFromList(By.cssSelector("div[class='product_name_3Lh3t']"),0).getText().substring(0,20);
        String secondProduct = getElementFromList(By.cssSelector("div[class='product_name_3Lh3t']"),1).getText().substring(0,20);
        Assert.assertEquals("Products are different!",productPage.productName, firstProduct);
        Assert.assertEquals("Products are different!",productPage.productName, secondProduct);
    }
}
