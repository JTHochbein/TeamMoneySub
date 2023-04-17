package qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.factory.DriverFactory;

import java.time.Duration;

public class OMB_Waiter {

    long defaultTimeout = 7000;
    WebDriver driver = DriverFactory.getDriver();

    // wait for element to be located by driver
    public void forit(long customTimeout) {
        forit(By.name("Dies ist ein Timeout der durch ein wait.forit ausgelöst wurde: " + customTimeout), customTimeout);
    }
    public void forit(By locator) {
        forit(locator, defaultTimeout);
    }
    public void forit(By locator, long customTimeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(customTimeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Waited successfully for locator: " + locator);
        } catch (TimeoutException t) {
            System.out.println("Timeout catched for locator: " + locator);
        }
    }

}
