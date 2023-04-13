package qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.factory.DriverFactory;

import java.time.Duration;

public class Waiter {

    long defaultTimeout = 7000;
    WebDriver driver = DriverFactory.getDriver();

    // wait for element to be located by driver
    public void forit(By locator) {
        forit(locator, defaultTimeout);
    }
    public void forit(By locator, long customTimeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(customTimeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        System.out.println("Waited for locator: " + locator);
    }

}
