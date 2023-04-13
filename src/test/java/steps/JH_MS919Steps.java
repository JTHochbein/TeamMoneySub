package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DQA_PractisForm;
import pages.TDW_Homepage;
import qa.factory.DriverFactory;

public class JH_MS919Steps {
    WebDriver driver = DriverFactory.getDriver();
    DQA_PractisForm form = new DQA_PractisForm(driver);
    @Given("user opens the website dqa practiseform")
    public void user_opens_the_website_dqa_practiseform() {
        form.open_url();
    }
    @When("user fills the form")
    public void user_fills_the_form() throws InterruptedException {
        form.fill_form();
    }
    @When("clicks on submit")
    public void clicks_on_submit() {
        form.click_submit();
    }
    @Then("user gets a list of his submitted data")
    public void user_gets_a_list_of_his_submitted_data() {
        form.list_proof();
    }
}
