package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValrHomePage {

    // page elements

    @FindBy(css = ".eIWmDz.styles__Svg-sc-1554909-1")
    public WebElement img_valrLogoImageLink;

    @FindBy(css = ".dgldUx.jyjEmi.styles__PrimaryButton-q6yg0j-12.styles__StyledLink-s1xnkh-1")
    public WebElement btn_getStarted;

    @FindBy(css = ".jcfWny.jyjEmi.styles__SecondaryButton-q6yg0j-13.styles__StyledLink-s1xnkh-1")
    public WebElement btn_signIn;

    @FindBy (css = ".ikmsSD.jyjEmi.styles__PrimaryButton-sc-1wubprt-8.styles__StyledLink-s1xnkh-1")
    public WebElement btn_startTrading;

    @FindBy (css = ".dUOIZB.styles__Svg-sc-1554909-1 > use")
    public WebElement img_valrAppImageLink;

    @FindBy (css = ".jgIRwG.jvtNHU.kxtUQD.src__Box-sc-1sbtrzs-0.src__Flex-sc-1sbtrzs-1.styles__NonAuthHeaderContainer-q6yg0j-11 > div:nth-of-type(2) > a:nth-of-type(1)")
    public WebElement txt_theDetailsMenuItem;

    @FindBy (css = ".jgIRwG.jvtNHU.kxtUQD.src__Box-sc-1sbtrzs-0.src__Flex-sc-1sbtrzs-1.styles__NonAuthHeaderContainer-q6yg0j-11 > div:nth-of-type(2) > a:nth-of-type(2)")
    public WebElement txt_buySellMenuItem;

    @FindBy(css = ".jgIRwG.jvtNHU.kxtUQD.src__Box-sc-1sbtrzs-0.src__Flex-sc-1sbtrzs-1.styles__NonAuthHeaderContainer-q6yg0j-11 > div:nth-of-type(2) > a:nth-of-type(3)")
    public WebElement txt_valrPayMenuItem;

    @FindBy(css = ".bJxRGx.cWvzlS.styles__Link-q6yg0j-3.styles__StyledLink-s1xnkh-1 > .jfnGaH.styles__DropdownContent-q6yg0j-6")
    public WebElement dropdn_exchange;

    @FindBy(css = ".bAITaN.styles__Svg-sc-1554909-1 > use")
    public WebElement btn_buySellbuttonlink;

    @FindBy(css = "div:nth-of-type(1) > .dRMTox.styles__DetailsCardContent-sc-1wubprt-31 > .eBJeqk.jtsyiW.styles__Container-sc-1554909-0.styles__DetailsCardIllustration-sc-1wubprt-36 > .gcFqLt.styles__Svg-sc-1554909-1")
    public WebElement img_cryptoAssets;

    @FindBy(css = ".ksCLef.styles__PhoneIllustration-sc-1wubprt-44")
    public WebElement img_mobileApplicationIllustration;

    @FindBy(css = ".keOwLZ.styles__RewardContent-sc-1wubprt-51 > .ikmsON.jyjEmi.styles__PrimaryButton-sc-1wubprt-8.styles__StyledLink-s1xnkh-1")
    public WebElement btn_learnMore;

    @FindBy(css = ".dAkELr.gjcNYY.styles__Container-sc-1554909-0.styles__SocialAndroidIcon-rq6rmn-2 > .CgQMX.styles__Svg-sc-1554909-1")
    public WebElement btn_googlePlayApp;

    @FindBy(css = ".hzreeA.styles__Svg-sc-1554909-1 > use")
    public WebElement btn_appleAppStore;

    @FindBy(css = ".eQsAwd.styles__Policies-sc-1wubprt-73 > a:nth-of-type(1)")
    public WebElement txt_privacyPolicyTextLink;

    @FindBy(css = "a:nth-of-type(2) > .dAkELr.ldhSKp.styles__Container-sc-1554909-0.styles__SocialIcon-sc-1wubprt-75 > .jMJwp.styles__Svg-sc-1554909-1 > use")
    public WebElement img_Twitter;

    protected WebDriver driver;

    WebDriverWait wait;
    public ValrHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        PageFactory.initElements(driver, this);
    }

    // page actions

    public void scrollToTwitterImgLink() {
        wait.until(ExpectedConditions.visibilityOf(img_Twitter));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", img_Twitter);
    }

    public void scrollToPrivacyPolicyFooterItem() {
        wait.until(ExpectedConditions.visibilityOf(txt_privacyPolicyTextLink));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", txt_privacyPolicyTextLink);
    }

    public void scrollToAppleAppStoreButton() {
        wait.until(ExpectedConditions.visibilityOf(btn_appleAppStore));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", btn_appleAppStore);
    }

    public void scrollToGooglePlayAppButton() {
        wait.until(ExpectedConditions.visibilityOf(btn_googlePlayApp));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", btn_googlePlayApp);
    }

    public void scrollToLearnMoreButton(){
        wait.until(ExpectedConditions.visibilityOf(btn_learnMore));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", btn_learnMore);
    }

    public void scrollToMobileApplicationIllustration() {
        wait.until(ExpectedConditions.visibilityOf(img_mobileApplicationIllustration));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", img_mobileApplicationIllustration);
    }

    public void scrollToCryptoAssetsImage() {
        wait.until(ExpectedConditions.visibilityOf(img_cryptoAssets));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", img_cryptoAssets);
    }

    public void scrollToBuySellButtonLink() {
        wait.until(ExpectedConditions.visibilityOf(btn_buySellbuttonlink));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", btn_buySellbuttonlink);
    }

    public void clickTheValrPayMenuItem() {
        wait.until(ExpectedConditions.visibilityOf(txt_valrPayMenuItem));
        txt_valrPayMenuItem.click();
    }

    public void clickTheGetStartedButton() {
        wait.until(ExpectedConditions.visibilityOf(btn_getStarted));
        btn_getStarted.click();
    }
}
