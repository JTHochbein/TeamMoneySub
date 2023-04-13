package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OMB_MS950_ChipPage {

    WebDriver driver;

    String window;
    By cookieFrame = By.id("sp_message_iframe_732150");

    By acceptButton = By.cssSelector("button[title='Alle Akzeptieren']");


    public OMB_MS950_ChipPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWindow() {
        return driver.getWindowHandle();
    }

    public WebElement getCookieFrame() {
        return driver.findElement(cookieFrame);
    }

    public WebElement getAcceptButton() {
        return driver.findElement(acceptButton);
    }

}
