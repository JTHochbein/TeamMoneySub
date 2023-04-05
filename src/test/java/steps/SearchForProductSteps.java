package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchForPrductPage;
import qa.factory.DriverFactory;

public class SearchForProductSteps {

final String productsName="blue and green";
    SearchForPrductPage searchForPrductPage = new SearchForPrductPage(DriverFactory.getDriver());
    @When("user moves to search field and types a products name")
    public void user_moves_to_search_field_and_types_a_products_name() {
        searchForPrductPage.getSearchField().sendKeys(productsName);
    }
    @And("user hits search button")
    public void user_hits_search_button() {
        searchForPrductPage.getSearchButton().click();
    }
    @And("user selects the product they looking for")
    public void user_selects_the_product_they_looking_for() {
        searchForPrductPage.selectProduct().click();
    }
    @And("user clicks on button Add to cart")
    public void user_clicks_on_button_add_to_cart() throws InterruptedException {
        searchForPrductPage.getAddToCardButton().click();
        Thread.sleep(200);
    }
    @Then("product must be added to Shopping cart")
    public void product_must_be_added_to_shopping_cart() {
        Assert.assertTrue(searchForPrductPage.checkProductAdded().isDisplayed());
    }
}
