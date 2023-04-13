package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.TDW_Homepage;
import pages.TDW_checkout;
import pages.TDW_shoppingcart;
import qa.factory.DriverFactory;

public class JH_MS055Steps {
    WebDriver driver = DriverFactory.getDriver();
    TDW_checkout checkout = new TDW_checkout(driver);
    TDW_Homepage homepage = new TDW_Homepage(driver);
    @Given("user has at least one item in shopping cart")
    public void user_has_at_least_one_item_in_shopping_cart() {
        driver.get("https://demowebshop.tricentis.com/apparel-shoes");
        homepage.bluejeans_atc();
        homepage.atc_proof();
    }
    @Given("user has opened shopping cart")
    public void user_has_opened_shopping_cart() {
        homepage.shoppingcart_click();
        homepage.shoppingcart_proof();
        checkout.accept_tos();
    }
    @When("user does the checkout process")
    public void user_does_the_checkout_process() throws InterruptedException {
        checkout.checkout_btn_click();
        checkout.login_process();
        checkout.accept_tos();
        checkout.checkout_btn_click();
        checkout.checkout_loggedin_checkout();
    }
    @Then("user gets an order number")
    public void user_gets_an_order_number() {
        checkout.verification_checkout();
    }
    @Then("verification that is order is completed")
    public void verification_that_is_order_is_completed() {

    }
}
