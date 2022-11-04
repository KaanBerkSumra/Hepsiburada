import org.apache.log4j.Logger;
import org.junit.Test;

public class TestCases extends BaseTest{
    final static Logger logger = Logger.getLogger(TestCases.class.getName());

    HomePage homePage = new HomePage(driver,logger);
    LoginPage loginPage = new LoginPage(driver,logger);
    ProductPage productPage = new ProductPage(driver,logger);
    BasketPage basketPage = new BasketPage(driver,logger);

    @Test
    public void firstCaseTest() throws InterruptedException {
        homePage.navigateToWebsite();
        homePage.acceptCookies();
        homePage.navigateToLoginPage();
        loginPage.typeMail();
        loginPage.typePassword();
        homePage.verifyLogin();
        homePage.searchBox();
        productPage.selectProduct();
        productPage.addToBasket();
        productPage.getNameOfProduct();
        productPage.goToBasket();
        basketPage.checkProductNames();
    }

    @Test
    public void secondCaseTest() throws InterruptedException {
        homePage.navigateToWebsite();
        homePage.acceptCookies();
        homePage.searchBox();
        productPage.selectProduct();
        productPage.addToBasket();
        productPage.getNameOfProduct();
        productPage.goToBasket();
        basketPage.checkProductNames();
    }
}
