package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SA_TMCompose {
    private WebDriver driver;

    public SA_TMCompose(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    private final By LoginButton = By.id("yt1");
    private final By Usernamefield = By.id("LoginForm_username");
    public void LoginButtonClick(){
        this.driver.findElement(LoginButton).click();


    }
    public void LoginProcess(){
        this.driver.findElement(LoginButton).click();
        this.driver.findElement(Usernamefield).sendKeys("Saltan667");

    }

    public void OpenURL(){
        this.driver.get("https://www.transfermarkt.de/");

    }
    public void OpenURLLogin(){
        this.driver.get("");


    }
}
