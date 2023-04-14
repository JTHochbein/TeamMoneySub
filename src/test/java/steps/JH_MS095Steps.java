package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.JH_ChipDE;
import pages.JH_FocusDE;
import pages.JH_SpiegelDE;
import pages.JH_TDW_Homepage;
import qa.factory.DriverFactory;

public class JH_MS095Steps {
    WebDriver driver = DriverFactory.getDriver();
    JH_ChipDE chip = new JH_ChipDE(driver);
    JH_FocusDE focus = new JH_FocusDE(driver);
    JH_SpiegelDE spiegel = new JH_SpiegelDE(driver);
    //FOCUS.DE
    @Given("user is on website focusde")
    public void user_is_on_website_focusde() {
        focus.openURL();
    }
    @When("user accepts cookies on focusde")
    public void user_accepts_cookies_on_focusde() {
        focus.accept_cookies();
    }
    @Then("the cookie frame vanishes on focusde")
    public void the_cookie_frame_vanishes_on_focusde() {
        focus.cookies_proof();
    }
    //CHIP.DE
    @Given("user is on website chipde")
    public void user_is_on_website_chipde() {
        chip.openURL();
    }
    @When("user accepts cookies on chipde")
    public void user_accepts_cookies_on_chipde() {
        chip.accept_cookies();
    }
    @Then("the cookie frame vanishes on chipde")
    public void the_cookie_frame_vanishes_on_chipde() {
        chip.cookies_proof();
    }
    //SPIEGEL.DE
    @Given("user is on website spiegelde")
    public void user_is_on_website_spiegelde() {
        spiegel.openURL();
    }
    @When("user accepts cookies on spiegelde")
    public void user_accepts_cookies_on_spiegelde() {
        spiegel.accept_cookies();
    }
    @Then("the cookie frame vanishes on spiegelde")
    public void the_cookie_frame_vanishes_on_spiegelde() {
        spiegel.cookies_proof();
    }
}
