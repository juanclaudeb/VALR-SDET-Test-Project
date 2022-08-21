package Steps;

import Hooks.Hook;
import Pages.ValrPayPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ValrPayPageStepDefinition {

    ValrPayPage valrPayPage = new ValrPayPage(Hook.getDriver());

    @Given("I am on the valr pay page")
    public void i_am_on_the_valr_pay_page() {
        Assert.assertTrue(valrPayPage.img_valrPayLogo.isDisplayed());
        Assert.assertEquals("https://www.valr.com/pay", Hook.getDriver().getCurrentUrl());
    }

    @Then("I should see the valr pay image")
    public void i_should_see_the_valr_pay_image() {
        Assert.assertTrue(valrPayPage.img_valrPayLogo.isDisplayed());
    }

    @And("I scroll down and click on the second get started button")
    public void i_scroll_down_and_click_on_the_second_get_started_button() {
        valrPayPage.scrollToAndClickTheReceiveGetStartedButton();
        Assert.assertEquals("https://www.valr.com/signup", Hook.getDriver().getCurrentUrl());
    }
}
