package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SB_MS921_UploadImage_Page {

    public WebDriver driver;


    public SB_MS921_UploadImage_Page(WebDriver driver) {this.driver = driver;}

    public WebElement hitUploadLink() { return driver.findElement(By.id("fileinput"));}

    public WebElement hitItsImage() { return driver.findElement(By.id("itsanimage"));}

    public WebElement hitSubmit() { return driver.findElement(By.className("styled-click-button"));}

    public WebElement checkChoosefile() { return driver.findElement(By.xpath("/html/body/div/h1"));}

    public WebElement uploadSuccessful() { return driver.findElement(By.xpath("/html/body/div/div[2]/p"));}
}
