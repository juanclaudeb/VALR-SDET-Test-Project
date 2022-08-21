package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

import java.time.Duration;

public class Hook {

    private static WebDriver driver;

    @Before
    public void setup() {

        System.out.println("Setup initiated");

        String valrHomeUrl = "https://www.valr.com";

        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            // Uncomment below driver options for headless configuration
            //options.addArguments("--headless");
            //options.addArguments("--no-sandbox");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);

            driver.get(valrHomeUrl);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            driver.manage().window().maximize();
        }
        else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            // Uncomment below driver options for headless configuration
            //options.addArguments("--headless");
            //options.addArguments("--no-sandbox");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(firefoxOptions);

            driver.get(valrHomeUrl);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            driver.manage().window().maximize();
        }
    }

    @After
    public void teardown() {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
