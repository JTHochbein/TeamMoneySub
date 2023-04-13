package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SB_MS921_UploadImage_Page;
import qa.factory.DriverFactory;

import java.time.Duration;

public class SB_MS921_UploadImage_Steps {



    final String URL="https://testpages.herokuapp.com/styled/file-upload-test.html";
     WebDriver driver = DriverFactory.getDriver();
    private SB_MS921_UploadImage_Page SBMS921UploadImagePage = new SB_MS921_UploadImage_Page(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("I open the application")
    public void i_open_the_application(){

        driver.get(URL);



    }

    @And("I should see the Choose file button")
    public void i_should_see_the_Choose_file_button(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/h1")));
        String massege = SBMS921UploadImagePage.checkChoosefile().getText();
        Assert.assertEquals(massege, "Upload a File");



    }
    @When("I choose my file and submit Upload")
    public void i_choose_my_file_and_submit_upload(){

        SBMS921UploadImagePage.hitUploadLink().sendKeys("C:\\Users\\Suliman Behroz\\Downloads\\bild.png.png");
        SBMS921UploadImagePage.hitItsImage().click();
        SBMS921UploadImagePage.hitSubmit().submit();

    }
    @Then("I should see Upload successful message")
    public void I_should_see_Upload_successful_message(){



    }
    @And("I wait for 10 Seconds and close the window")
    public void I_wait_for_10_Seconds_and_close_the_window() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/p")));

    }


}


