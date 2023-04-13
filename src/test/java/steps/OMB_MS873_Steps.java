package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import pages.OMB_MS873_FinanzenPage;
import pages.OMB_MS873_InvestmentPage;
import pages.OMB_MS873_MainPage;
import qa.factory.DriverFactory;
import qa.util.Waiter;

import java.util.TreeMap;

public class OMB_MS873_Steps {

    WebDriver driver = DriverFactory.getDriver();
    Waiter wait = new Waiter();
    final String URL = "https://www.focus.de/";
    private TreeMap<String, String> vars = new TreeMap<>();

    private OMB_MS873_MainPage mainPage = new OMB_MS873_MainPage(driver);
    private OMB_MS873_FinanzenPage finanzenPage = new OMB_MS873_FinanzenPage(driver);
    private OMB_MS873_InvestmentPage investmentPage = new OMB_MS873_InvestmentPage(driver);

    
    @Given("The user locates to the „Festgeld“-Comparison on the focus.de website")
    public void the_user_locates_to_the_festgeld_comparison_on_the_focus_de_website() {
        driver.get(URL);
        driver.switchTo().frame(mainPage.getCookiesFrame());
        mainPage.getCookiesAcceptButton().click();
        mainPage.getFinanzenMenu().click();
        wait.forit(finanzenPage.getByFestgeldLink());
        finanzenPage.getFestgeldLink().click();
    }

    // send custom investment amount to input field
    @When("the user enters {int} Euros as an amount")
    public void the_user_enters_euros_as_an_amount(Integer int1) {
        wait.forit(investmentPage.getByInvestmentAmount(),10000);
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
        try {
            wait.forit(investmentPage.banksBlock);
            investmentPage.getBanksBlock().getText();
            vars.put("name1", investmentPage.getBanksBlock().getText());
            vars.put("zins1", investmentPage.getBanks1Interest().getText());
            vars.put("profit1", investmentPage.getBanks1profit().getText());
            vars.put("name2", investmentPage.getBanks2Name().getText());
            vars.put("zins2", investmentPage.getBanks2Interest().getText());
            vars.put("profit2", investmentPage.getBanks2Profit().getText());
            vars.put("name3", investmentPage.getBanks3Name().getText());
            vars.put("zins3", investmentPage.getBanks3Interest().getText());
            vars.put("profit3", investmentPage.getBanks3Profit().getText());
            for (int i = 1; i <= 3; i++) {
                System.out.println("Bank " + i + ": " + vars.get("name" + i) + ", Zins: " + vars.get("zins" + i) + ", Profit: " + vars.get("profit" + i));
            }
        } catch (TimeoutException e) {
            System.out.println("Keine Banken zu den genannten Konditionen verfügbar");
        }
    }

}
