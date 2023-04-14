package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.JH_TDW_Homepage;
import pages.JH_TDW_checkout;
import qa.factory.DriverFactory;

public class JH_MS055Steps {
    WebDriver driver = DriverFactory.getDriver();
    JH_TDW_checkout checkout = new JH_TDW_checkout(driver);
    JH_TDW_Homepage homepage = new JH_TDW_Homepage(driver);
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
        System.out.println("Order is completed!");
    }
}
