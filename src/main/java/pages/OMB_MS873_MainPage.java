package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OMB_MS873_MainPage {

    WebDriver driver;
    By frameCookies = By.id("sp_message_iframe_794704");
    By acceptButton = By.cssSelector("button[title='Akzeptieren']");
    By menuWrapper = By.cssSelector("#menu-wrapper > div > div > div:nth-child(2) > a");

    public OMB_MS873_MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement getCookiesFrame() {
        return driver.findElement(frameCookies);
    }

    public WebElement getCookiesAcceptButton() {
        return driver.findElement(acceptButton);
    }

    public WebElement getFinanzenMenu() {
        return driver.findElement(menuWrapper);
    }


}
