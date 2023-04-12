package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TDW_Homepage;
import pages.TDW_checkout;
import pages.TDW_shoppingcart;
import qa.factory.DriverFactory;

public class JH_MS072Steps {
    WebDriver driver = DriverFactory.getDriver();
    TDW_Homepage homepage = new TDW_Homepage(driver);
    TDW_shoppingcart shoppingcart = new TDW_shoppingcart(driver);
    @Given("user opens the website tdw")
    public void user_opens_the_website_tdw() {
        homepage.openurl();


    }
    @When("the user adds at least five articles to the shopping cart")
    public void the_user_adds_at_least_articles_to_the_shopping_cart() throws InterruptedException {
        homepage.add_five_articles();
    }
    @When("clicks on shopping cart")
    public void clicks_on_shopping_cart() throws InterruptedException {
        homepage.shoppingcart_click();
        Thread.sleep(5000);

    }
    @Then("the user receives a total price that corresponds to the sum of all articles")
    public void the_user_receives_a_total_price_that_corresponds_to_the_sum_of_all_articles() {
        shoppingcart.calculation_of_shoppingcart_proof2();
    }
}
