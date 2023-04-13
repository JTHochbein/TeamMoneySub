package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import pages.OMB_MS950_AmazonPage;
import pages.OMB_MS950_ChipPage;
import pages.OMB_MS950_IdealoPage;
import qa.factory.DriverFactory;
import qa.util.Waiter;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class OMB_MS950_AcceptRandomCookiesSteps {
    WebDriver driver = DriverFactory.getDriver();
    Waiter wait = new Waiter();
    // Window Handles
    String window1, window2, window3;
    // Website URLs
    String[] urls = {"https://www.idealo.de/", "https://www.chip.de/", "https://www.amazon.de/"};
    WebElement frame1, frame2, frame3;
    String outputFileNumber;
    String outputPath = ".\\src\\test\\java\\steps\\output\\cookieCheck_";
    String outputFileType = ".txt";

    private OMB_MS950_IdealoPage idealoPage = new OMB_MS950_IdealoPage(driver);
    private OMB_MS950_ChipPage chipPage = new OMB_MS950_ChipPage(driver);
    private OMB_MS950_AmazonPage amazonPage = new OMB_MS950_AmazonPage(driver);

    // Open all 3 urls / amazon could need site refresh (try/catch)
    @Given("The user locates to three different websites")
    public void the_user_locates_to_three_different_websites() {
        // idealo.de
        driver.get(urls[0]);
        window1 = idealoPage.getWindow();
        driver.switchTo().newWindow(WindowType.TAB);
        // chip.de
        driver.get(urls[1]);
        window2 = chipPage.getWindow();
        driver.switchTo().newWindow(WindowType.TAB);
        // try amazon.de, refresh if no cookie window
        driver.get(urls[2]);
        boolean a = false;
        while (!a) {
            try {
                amazonPage.getCookieAccept();
                a = true;
            } catch (NoSuchElementException e) {
                driver.navigate().refresh();
            }
        }
        window3 = amazonPage.getWindow();
        // Starting point window1
        driver.switchTo().window(window1);
    }
    // Accept all cookies
    @When("click on accept all cookies button")
    public void click_on_accept_all_cookies_button() {
        // idealo.de
        frame1 = idealoPage.getCookieFrame();
        driver.switchTo().frame(frame1);
        idealoPage.getAcceptButton().click();
        // chip.de
        driver.switchTo().window(window2);
        frame2 = chipPage.getCookieFrame();
        driver.switchTo().frame(frame2);
        chipPage.getAcceptButton().click();
        // amazon.de
        driver.switchTo().window(window3);
        amazonPage.getCookieAccept().click();
    }
    // Accept only necessary cookies
    @When("click on deny all cookies button")
    public void clickOnDenyAllCookiesButton() {
        // Seite 1
        driver.switchTo().frame(frame1);
        driver.findElement(By.cssSelector("button[title='Optionale Cookies ablehnen']")).click();
        // Seite 2
        driver.switchTo().window(window2);
        frame2 = driver.findElement(By.id("sp_message_iframe_732150"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.cssSelector("button[title='Einstellungen']")).click();
        driver.switchTo().defaultContent(); // fucking wichtig!
        frame3 = driver.findElement(By.id("sp_message_iframe_157536"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.cssSelector("button[title='alle ablehnen']")).click();
        // Seite 3
        driver.switchTo().window(window3);
        driver.findElement(By.cssSelector("#sp-cc-rejectall-link")).click();
    }
    // Try to find cookie windows, catch NoSuchElementException
    @Then("cookie popup should disappear")
    public void cookie_popup_should_disappear() {
        driver.switchTo().window(window1);
        try {
            // Seite 1: idealo.de
            driver.switchTo().frame(frame1);
            driver.findElement(By.cssSelector("button[title='Optionale Cookies ablehnen']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Check: Cookie Popup für idealo.de geschlossen.");
        }
        driver.switchTo().window(window2);
        try {
            // Seite 2: chip.de
            frame2 = driver.findElement(By.id("sp_message_iframe_732150"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.cssSelector("button[title='Alle Akzeptieren']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Check: Cookie Popup für chip.de geschlossen.");
        }
        driver.switchTo().window(window3);
        try {
            // Seite 3: amazon.de
            driver.findElement(By.cssSelector("#sp-cc-rejectall-link")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Check: Cookie Popup für amazon.de geschlossen.");
        }
    }
    // Get name and number of cookies for each website, then write file output
    @And("list number of cookies for each website")
    public void list_number_of_cookies_for_each_website() {
        String[] windows = new String[3];
        windows[0] = window1; windows[1] = window2; windows[2] = window3;
        String url;
        for(String currentwindow: windows) {
            driver.switchTo().window(currentwindow);
            url = driver.getCurrentUrl();
            url = url.replace("https://www.", "");
            url = url.replace(".de/", "");
            int cookiesSize = driver.manage().getCookies().size();
            String outputFile = outputPath + outputFileNumber + url + outputFileType;
            String outputString = "Anzahl der Cookies von " + outputFileNumber + " auf " + url + ":" + "\n" + cookiesSize;
            try {
                FileWriter output = new FileWriter(outputFile);
                output.write(outputString);
                System.out.println(outputString);
                output.close();
            } catch (IOException e) {
                System.out.println("Fehler beim Schreiben der Datei...");
                e.printStackTrace();
            }
        }
    }

}
