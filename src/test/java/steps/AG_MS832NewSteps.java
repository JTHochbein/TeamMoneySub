package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AG_LoginPageTDWS;

import qa.factory.DriverFactory;
import java.util.*;


public class AG_MS832NewSteps {
    WebDriver driver;
    final String UrlLogin = "https://demowebshop.tricentis.com/login";
    private AG_LoginPageTDWS AG_loginPageTDWS;


    @Given("a user wants to add items to the shopping cart without logging in to their account")
    public void a_user_wants_to_add_items_to_the_shopping_cart_without_logging_in_to_their_account() {
        driver = DriverFactory.getDriver();
        AG_loginPageTDWS = new AG_LoginPageTDWS(driver);
        driver.get(UrlLogin);
    }

    @When("the user visits the website and selects the items they want to purchase")
    public void the_user_visits_the_website_and_selects_the_items_they_want_to_purchase() {
        AG_loginPageTDWS.navigateToNotebooksPage();
        AG_loginPageTDWS.selectFirstNotebook();
        AG_loginPageTDWS.addToCart();
        AG_loginPageTDWS.navigateToAllInOnePage();
        AG_loginPageTDWS.selectAllInOneProduct();
    }

    @When("the user proceeds to checkout without logging in")
    public void the_user_proceeds_to_checkout_without_logging_in() {
        AG_loginPageTDWS.clickOnCheckoutButton();
        AG_loginPageTDWS.enterFirstName("Max");
        AG_loginPageTDWS.enterLastName("Mustermann");
        AG_loginPageTDWS.selectGiftCard();
        AG_loginPageTDWS.agreeToTermsAndConditions();
    }

    @When("the user sees the confirmation message")
    public void the_user_sees_the_confirmation_message() {
        String actualSuccessMessage = AG_loginPageTDWS.getSuccessMessage();
        String expectedSuccessMessage = "Your order has been successfully processed!";
        Assert.assertEquals(expectedSuccessMessage, actualSuccessMessage);
    }
}
