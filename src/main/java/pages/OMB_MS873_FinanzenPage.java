package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.factory.DriverFactory;

import java.util.logging.Level;

public class OMB_MS873_FinanzenPage {
    WebDriver driver;
    By linkChild1 = By.cssSelector("#teasBoxfwid31 > ul > li:nth-child(4) > a");
    By linkChild2 = By.cssSelector("#teasBoxfwid32 > ul > li:nth-child(4) > a");


    public OMB_MS873_FinanzenPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFestgeldLink() {
        WebElement returnValue;
        try {
           returnValue = driver.findElement(linkChild1);
            System.out.println("Gefunden: " + linkChild1);
           return returnValue;
        } catch (NoSuchElementException e) {
            // DriverFactory.logger(Level.WARNING, "Logger: Could not find: " + linkChild1);
            System.out.println("Konnte nicht finden: " + linkChild1);
        }
        try {
            returnValue = driver.findElement(linkChild2);
            System.out.println("Gefunden: " + linkChild2);
            return returnValue;
        } catch (NoSuchElementException e) {
            System.out.println("Konnte nicht finden: " + linkChild2);
            return null;
        }

    }

    public By getByFestgeldLink() {
        return linkChild2;
    }

    public By getLinkChild1() {
        return linkChild1;
    }

}
