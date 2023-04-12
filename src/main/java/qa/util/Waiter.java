package qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    public void waitForElementToBeLocated(By locator, long timeoutInMilliseconds, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(timeoutInMilliseconds));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        System.out.println(locator);
    }

}
