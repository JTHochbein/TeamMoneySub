package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.SA_TMCompose;
import qa.factory.DriverFactory;

import java.util.concurrent.TimeUnit;

public class SA_MS056Steps {
WebDriver driver = DriverFactory.getDriver();
SA_TMCompose Transfer = new SA_TMCompose(driver);

    @Given("User opens the Website")
    public void user_opens_the_website() throws InterruptedException {
        driver.get("https://www.transfermarkt.de/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.switchTo().frame(Transfer.getframecookies());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getexceptbutton().click();
        Transfer.getAnmeldebutton().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getUsernamefield().sendKeys("Saltan67");
        Transfer.getPasswordfield().sendKeys("Nelta66GmbH!");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getLoginButton().click();


    }
    @Given("User is logged in")
    public void user_is_logged_in() {

    }
    @When("User clicks on “Mein TM”")
    public void user_clicks_on_mein_tm() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getClickMeinTM().click();
    }
    @When("Clicks on “Meine Traumelf”")
    public void clicks_on_meine_traumelf() throws InterruptedException {
        Transfer.getClickMeinTM().click();
        Transfer.getClickTraumelf().click();
    }
    @When("Clicks on “Neue Elf erstellen”")
    public void clicks_on_neue_elf_erstellen() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getClickElfErstellen().click();
    }
    @Then("User can compose his dream starting eleven")
    public void user_can_compose_his_dream_starting_eleven() {
        Transfer.getClickFormation().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getChooseFormation().click();
    //TW
        Transfer.getChooseTW().click();
        Transfer.getSearchPlayer().sendKeys("Iker Casillas");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayer().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerOne().click();

    //RV
        Transfer.getChooseRV().click();
        Transfer.getSearchPlayer().sendKeys("Gökhan Gönül");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayer().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerOne().click();

    //RIV
        Transfer.getChooseRIV().click();
        Transfer.getSearchPlayer().sendKeys("Sergio Ramos");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerDrei().click();

    //LIV
        Transfer.getChooseLIV().click();
        Transfer.getSearchPlayer().sendKeys("Min-Jae Kim");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerTwo().click();

    //LV
        Transfer.getChooseLV().click();
        Transfer.getSearchPlayer().sendKeys("Marcelo Vieira da Silva Júnior");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayer().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerDrei().click();

    //RZM
        Transfer.getChooseRZM().click();
        Transfer.getSearchPlayer().sendKeys("Modric");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerTwo().click();

    //LZM
        Transfer.getChooseLZM().click();
        Transfer.getSearchPlayer().sendKeys("Casemiro");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerDrei().click();

    //ZOM
        Transfer.getChooseZOM().click();
        Transfer.getSearchPlayer().sendKeys("De Bruyne");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerDrei().click();


    //RF
        Transfer.getChooseRF().click();
        Transfer.getSearchPlayer().sendKeys("Shaqiri");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerTwo().click();

    //ST
        Transfer.getChooseST().click();
        Transfer.getSearchPlayer().sendKeys("Benzema");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerDrei().click();

    //LF
        Transfer.getChooseLF().click();
        Transfer.getSearchPlayer().sendKeys("Ronaldo");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Transfer.getSelectPLayerEins().click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Transfer.getSelectKaderPlayerVier().click();



    }



}
