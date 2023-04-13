package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {

    public WebDriver driver;


    public UploadPage(WebDriver driver) {this.driver = driver;}

    public WebElement hitUploadLink() { return driver.findElement(By.id("fileinput"));}

    public WebElement hitItsImage() { return driver.findElement(By.id("itsanimage"));}

    public WebElement hitSubmit() { return driver.findElement(By.className("styled-click-button"));}

    public WebElement checkChoosefile() { return driver.findElement(By.linkText("Upload a File"));}

    public WebElement uploadSuccessful() { return driver.findElement(By.linkText("Uploaded File"));}
}
