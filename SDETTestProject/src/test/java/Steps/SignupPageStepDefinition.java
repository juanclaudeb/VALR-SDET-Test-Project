package Steps;

import Hooks.Hook;
import Pages.ValrGetStartedPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SignupPageStepDefinition {

    ValrGetStartedPage valrGetStartedPage = new ValrGetStartedPage(Hook.getDriver());

    @Given("I am on the sign up page")
    public void i_am_on_the_sign_up_page() {
        Assert.assertEquals("https://www.valr.com/signup", Hook.getDriver().getCurrentUrl());
    }

    @And("^I insert my (.*) first name$")
    public void i_insert_my_first_name(String firstname) {
        valrGetStartedPage.insertFirstNameTextField(firstname);
        Assert.assertEquals(firstname, valrGetStartedPage.txt_firstName.getAttribute("value"));
    }

    @And("^I insert my (.*) last name$")
    public void iInsertMyLast_nameLastName(String lastname) {
        valrGetStartedPage.insertLastNameTextField(lastname);
        Assert.assertEquals(lastname, valrGetStartedPage.txt_lastName.getAttribute("value"));
    }

    @And("^I insert my (.*) email address$")
    public void iInsertMyEmail_addressEmailAddress(String emailAddress) {
        valrGetStartedPage.insertEmailAddressTextField(emailAddress);
        Assert.assertEquals(emailAddress, valrGetStartedPage.txt_emailAddress.getAttribute("value"));
    }

    @And("^I insert my (.*) password$")
    public void iInsertMyPasswordPassword(String password) {
        valrGetStartedPage.insertPasswordTextField(password);
        Assert.assertEquals(password, valrGetStartedPage.txt_password.getAttribute("value"));
    }
}
