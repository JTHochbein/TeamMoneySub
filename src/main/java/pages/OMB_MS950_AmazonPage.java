package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OMB_MS950_AmazonPage {

    WebDriver driver;

    String window;

    By cookieAccept = By.cssSelector("#sp-cc-accept");

    public OMB_MS950_AmazonPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWindow() {
        return driver.getWindowHandle();
    }

    public WebElement getCookieAccept() {
        return driver.findElement(cookieAccept);
    }
}
