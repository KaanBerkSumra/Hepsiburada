import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

        public static WebDriver driver;
        static ChromeOptions chromeOptions;

        @BeforeClass
        public static void setup(){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver(chromeOptions());

        }
        public static ChromeOptions chromeOptions() {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--start-fullscreen");
            chromeOptions.addArguments("--disable-blink-features");
            chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
            chromeOptions.addArguments("--disable-extensions");
            return chromeOptions;
        }
        @AfterClass
        public static void tearDown(){
            driver.quit();
        }
    }


