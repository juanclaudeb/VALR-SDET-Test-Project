package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValrGetStartedPage {

    // Page elements

    @FindBy(css = "input[name='firstName']")
    public WebElement txt_firstName;

    @FindBy(css = "input[name='lastName']")
    public WebElement txt_lastName;

    @FindBy(css = "input[name='email']")
    public WebElement txt_emailAddress;

    @FindBy(css = "input[name='password']")
    public WebElement txt_password;

    protected WebDriver driver;

    WebDriverWait wait;

    public ValrGetStartedPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        PageFactory.initElements(driver, this);
    }

    // Page actions

    public void insertFirstNameTextField(String firstname) {
        wait.until(ExpectedConditions.visibilityOf(txt_firstName));
        txt_firstName.sendKeys(firstname);
    }

    public void insertLastNameTextField(String lastname) {
        wait.until(ExpectedConditions.visibilityOf(txt_lastName));
        txt_lastName.sendKeys(lastname);
    }

    public void insertEmailAddressTextField(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOf(txt_emailAddress));
        txt_emailAddress.sendKeys(emailAddress);
    }

    public void insertPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(txt_password));
        txt_password.sendKeys(password);
    }
}
