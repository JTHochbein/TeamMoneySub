package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SA_TMCompose;
import qa.factory.DriverFactory;

public class SA_MS056Steps {
WebDriver driver = DriverFactory.getDriver();
SA_TMCompose Transfer = new SA_TMCompose(driver);

    @Given("User opens the Website")
    public void user_opens_the_website() {
        Transfer.OpenURL();

        Transfer.LoginButtonClick();
        Transfer.LoginProcess();




    }
    @Given("User is logged in")
    public void user_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on “Mein TM”")
    public void user_clicks_on_mein_tm() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicks on “Meine Traumelf”")
    public void clicks_on_meine_traumelf() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Clicks on “Neue Elf erstellen”")
    public void clicks_on_neue_elf_erstellen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can compose his dream starting eleven")
    public void user_can_compose_his_dream_starting_eleven() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
