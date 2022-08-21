package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValrPayPage {

    // page elements

    @FindBy(css = ".kMisrv.styles__Svg-sc-1554909-1 > use")
    public WebElement img_valrPayLogo;

    @FindBy(css = ".box__Box-sc-1yjqs41-0.fxsjRu > .box__Box-sc-1yjqs41-0.cGffFx > .button__AquamarineButton-hqze9g-2.cqnWab.ddCDwW.laenqL.styles__CallToAction-u6oi9o-6.styles__StyledLink-s1xnkh-1")
    public WebElement btn_receiveGetStarted;

    protected WebDriver driver;

    WebDriverWait wait;

    public ValrPayPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        PageFactory.initElements(driver, this);
    }

    // product page actions

    public void scrollToAndClickTheReceiveGetStartedButton() {
        wait.until(ExpectedConditions.visibilityOf(btn_receiveGetStarted));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", btn_receiveGetStarted);
        btn_receiveGetStarted.click();
    }

}
