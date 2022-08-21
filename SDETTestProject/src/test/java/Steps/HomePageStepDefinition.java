package Steps;

import Hooks.Hook;
import Pages.ValrHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageStepDefinition {

    ValrHomePage valrHomePage = new ValrHomePage(Hook.getDriver());

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        Hook.getDriver().getCurrentUrl().equals("https://www.valr.com");
    }

    @Then("I should see the valr logo image link")
    public void i_should_see_the_valr_logo_image_link() {
        Assert.assertTrue(valrHomePage.img_valrLogoImageLink.isDisplayed());
    }

    @Then("I should see the get started button")
    public void i_should_see_the_get_started_button() {
        Assert.assertTrue(valrHomePage.btn_getStarted.isDisplayed());
        Assert.assertEquals("Get started", valrHomePage.btn_getStarted.getText());
    }

    @Then("I should see the sign in button")
    public void i_should_see_the_sign_in_button() {
        Assert.assertTrue(valrHomePage.btn_signIn.isDisplayed());
        Assert.assertEquals("Sign in", valrHomePage.btn_signIn.getText());
    }

    @Then("I should see the start trading button")
    public void i_should_see_the_start_trading_button() {
        Assert.assertTrue(valrHomePage.btn_startTrading.isDisplayed());
        Assert.assertEquals("Start trading", valrHomePage.btn_startTrading.getText());
    }

    @Then("I should see the valr app image link")
    public void i_should_see_the_valr_app_image_link() {
        Assert.assertTrue(valrHomePage.img_valrAppImageLink.isDisplayed());
    }

    @Then("I should see the details menu section")
    public void i_should_see_the_details_menu_section() {
        Assert.assertTrue(valrHomePage.txt_theDetailsMenuItem.isDisplayed());
        Assert.assertEquals("The Details", valrHomePage.txt_theDetailsMenuItem.getText());
    }

    @Then("I should see the buy sell menu section")
    public void i_should_see_the_buy_sell_menu_section() {
        Assert.assertTrue(valrHomePage.txt_buySellMenuItem.isDisplayed());
        Assert.assertEquals("Buy/Sell", valrHomePage.txt_buySellMenuItem.getText());
    }

    @Then("I should see the valr pay menu section")
    public void i_should_see_the_valr_pay_menu_section() {
        Assert.assertTrue(valrHomePage.txt_valrPayMenuItem.isDisplayed());
        Assert.assertEquals("VALR Pay", valrHomePage.txt_valrPayMenuItem.getText());
    }

    @Then("I should see the exchange drop down menu section")
    public void i_should_see_the_exchange_drop_down_menu_section() {
        Assert.assertTrue(valrHomePage.dropdn_exchange.isDisplayed());
        Assert.assertEquals("Exchange", valrHomePage.dropdn_exchange.getText());
    }

    @Then("I should see the buy sell button link as i scroll down")
    public void i_should_see_the_buy_sell_button_link_as_i_scroll_down() {
        valrHomePage.scrollToBuySellButtonLink();
        Assert.assertTrue(valrHomePage.btn_buySellbuttonlink.isDisplayed());
    }

    @Then("I should see the crypto assets icon as i scroll down")
    public void i_should_see_the_crypto_assets_icon_as_i_scroll_down() {
        valrHomePage.scrollToCryptoAssetsImage();
        Assert.assertTrue(valrHomePage.img_cryptoAssets.isDisplayed());
    }

    @Then("I should see the mobile application images as i scroll down")
    public void i_should_see_the_mobile_application_images_as_i_scroll_down() {
        valrHomePage.scrollToMobileApplicationIllustration();
        Assert.assertTrue(valrHomePage.img_mobileApplicationIllustration.isDisplayed());
    }

    @Then("I should see the learn more button as i scroll down")
    public void i_should_see_the_learn_more_button_as_i_scroll_down() {
        valrHomePage.scrollToLearnMoreButton();
        Assert.assertTrue(valrHomePage.btn_learnMore.isDisplayed());
        Assert.assertEquals("Learn more", valrHomePage.btn_learnMore.getText());
    }

    @Then("I should see the google play app link as i scroll down")
    public void i_should_see_the_google_play_app_link_as_i_scroll_down() {
        valrHomePage.scrollToGooglePlayAppButton();
        Assert.assertTrue(valrHomePage.btn_googlePlayApp.isDisplayed());
    }

    @Then("I should see the apple app store link as i scroll down")
    public void i_should_see_the_apple_app_store_link_as_i_scroll_down() {
        valrHomePage.scrollToAppleAppStoreButton();
        Assert.assertTrue(valrHomePage.btn_appleAppStore.isDisplayed());
    }

    @Then("I should see the privacy policy footer section as i scroll down")
    public void i_should_see_the_privacy_policy_footer_section_as_i_scroll_down() {
        valrHomePage.scrollToPrivacyPolicyFooterItem();
        Assert.assertTrue(valrHomePage.txt_privacyPolicyTextLink.isDisplayed());
        Assert.assertEquals("Privacy Policy", valrHomePage.txt_privacyPolicyTextLink.getText());
    }

    @Then("I should see the valr footer twitter link as i scroll down")
    public void i_should_see_the_valr_footer_twitter_link_as_i_scroll_down() {
        valrHomePage.scrollToTwitterImgLink();
        Assert.assertTrue(valrHomePage.img_Twitter.isDisplayed());
    }

    @And("I click the valr pay menu item")
    public void i_click_the_valr_pay_menu_item() {
        valrHomePage.clickTheValrPayMenuItem();
    }

    @And("I click the get started button")
    public void i_click_the_get_started_button() {
        valrHomePage.clickTheGetStartedButton();
    }
}
