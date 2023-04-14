package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JH_FocusDE {
    private WebDriver driver;
    private final By accept_cookies_btn = By.xpath("//*[@id=\"notice\"]/div[4]/button[2]");
    WebElement iframe;
    public JH_FocusDE(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openURL() {
        driver.get("https://www.focus.de/");
    }
    public void accept_cookies() {
        WebElement iframe = driver.findElement(By.id("sp_message_iframe_794704"));
        this.driver.switchTo().frame(iframe);
        this.driver.manage().getCookies();
        this.driver.findElement(accept_cookies_btn).click();
        this.driver.switchTo().defaultContent();
    }
    public void cookies_proof() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(iframe));
        System.out.println("Cookies wurden Aktzeptiert!");
    }
}
