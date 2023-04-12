package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OMB_MS873_FinanzenPage;
import pages.OMB_MS873_InvestmentPage;
import pages.OMB_MS873_MainPage;
import qa.factory.DriverFactory;
import qa.util.Waiter;

import java.time.Duration;

public class OMB_MS873 {

    WebDriver driver = DriverFactory.getDriver();
    Waiter wait = new Waiter();
    final String URL = "https://www.focus.de/";
    private OMB_MS873_MainPage mainPage = new OMB_MS873_MainPage(driver);
    private OMB_MS873_FinanzenPage finanzenPage = new OMB_MS873_FinanzenPage(driver);
    private OMB_MS873_InvestmentPage investmentPage = new OMB_MS873_InvestmentPage(driver);



    @Given("The user locates to the „Festgeld“-Comparison on the focus.de website")
    public void the_user_locates_to_the_festgeld_comparison_on_the_focus_de_website() {
        driver.get(URL);
        driver.switchTo().frame(mainPage.getCookiesFrame());
        mainPage.getCookiesAcceptButton().click();
        mainPage.getFinanzenMenu().click();
        wait.waitForElementToBeLocated(finanzenPage.getByFestgeldLink(),7000,driver);
        finanzenPage.getFestgeldLink().click();
    }

    // send custom investment amount to input field
    @When("the user enters {int} Euros as an amount")
    public void the_user_enters_euros_as_an_amount(Integer int1) {
        wait.waitForElementToBeLocated(investmentPage.getByInvestmentAmount(),7000,driver);
        investmentPage.getInvestmentAmount().clear();
        investmentPage.getInvestmentAmount().sendKeys(int1.toString());
    }

    // select 12 months time period as duration
    @And("the default filters remain, the timeperiod will be set to 12 months")
    public void the_default_filters_remain_the_timeperiod_will_be_set_to_months() {
        investmentPage.setInvestmentDuration();
        investmentPage.getSubmitButton().click();
    }

    // Get the best three offers and output bankname, interest(%) and profit(€)
    @Then("after submitting a list of banks should be presented")
    public void after_submitting_a_list_of_banks_should_be_presented() {

    }

}
