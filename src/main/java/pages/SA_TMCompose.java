package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SA_TMCompose {
    private WebDriver driver;

    public SA_TMCompose(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver, this);
    }
    private final By LoginButton = By.name("yt1");
    private final By Usernamefield = By.id("LoginForm_username");
    private final By Passwordfield = By.id("LoginForm_password");
    private final By AcceptCookies = By.id("sp_message_iframe_757749");
    private final By Anmeldebutton = By.xpath("//*[@id=\"login\"]/span");
    private final By framecookies = By.id("sp_message_iframe_757749");
    private final By ExceptButton = By.xpath("//*[@id=\"notice\"]/div[3]/div[2]/button");
    private final By ClickMeinTM = By.xpath("//*[@id=\"main\"]/header/nav/ul/li[7]/span");
    private final By ClickTraumelf = By.xpath("//*[@id=\"main\"]/header/nav/ul/li[7]/div/div[1]/ul/li[2]/ul/li[3]/a");
    private final By ClickElfErstellen = By.xpath("//*[@id=\"main\"]/main/div[4]/div[2]/div[1]/div/a");
    private final By ClickFormation = By.name("traumelf_taktik");
    private final By ChooseFormation = By.xpath("//*[@id=\"Begegnung_taktik_id_g\"]/option[15]");
    private final By ChooseTW = By.xpath("//*[@id=\"field\"]/li[11]/div/img");
    private final By ChooseRV = By.xpath("//*[@id=\"field\"]/li[1]/div/img");
    private final By ChooseRIV = By.xpath("//*[@id=\"field\"]/li[3]/div/img");
    private final By ChooseLIV = By.xpath("//*[@id=\"field\"]/li[2]/div/img");
    private final By ChooseLV = By.xpath("//*[@id=\"field\"]/li[4]/div/img");
    private final By ChooseRZM = By.xpath("//*[@id=\"field\"]/li[5]/div/img");
    private final By ChooseLZM = By.xpath("//*[@id=\"field\"]/li[6]/div/img");
    private final By ChooseZOM = By.xpath("//*[@id=\"field\"]/li[7]/div/img");
    private final By ChooseRF = By.xpath("//*[@id=\"field\"]/li[8]/div/img");
    private final By ChooseST = By.xpath("//*[@id=\"field\"]/li[9]/div/img");
    private final By ChooseLF = By.xpath("//*[@id=\"field\"]/li[10]/div/img");
    private final By SearchPlayer = By.id("searchPlayer");
    private final By SelectPLayer = By.xpath("//*[@id=\"traumelf-form\"]/tm-lineup/div[1]/div[2]/ul/li");
    private final By SelectPlayerEins = By.xpath("//*[@id=\"traumelf-form\"]/tm-lineup/div[1]/div[2]/ul/li[1]");
    private final By SelectKaderPlayerOne = By.xpath("//*[@id=\"squad\"]/li");
    private final By SelectKaderPlayerTwo = By.xpath("//*[@id=\"squad\"]/li[2]");
    private final By SelectKaderPlayerDrei = By.xpath("//*[@id=\"squad\"]/li[1]");
    private final By SelectKaderPlayerVier = By.xpath("//*[@id=\"squad\"]/li[4]");





    public WebElement getframecookies(){
        return driver.findElement(framecookies);
    }
    public WebElement getexceptbutton(){
        return driver.findElement(ExceptButton);
    }

    public WebElement getAnmeldebutton(){
        return driver.findElement(Anmeldebutton);
    }

    public WebElement getUsernamefield(){
        return driver.findElement(Usernamefield);
    }
    public WebElement getPasswordfield(){
        return driver.findElement(Passwordfield);
    }
    public WebElement getLoginButton(){
        return driver.findElement(LoginButton);
    }
    public WebElement getClickMeinTM(){
        return driver.findElement(ClickMeinTM);
    }
    public WebElement getClickTraumelf(){
        return driver.findElement(ClickTraumelf);
    }
    public WebElement getClickElfErstellen(){
        return driver.findElement(ClickElfErstellen);
    }
    public final WebElement getClickFormation(){
        return driver.findElement(ClickFormation);
    }
    public final WebElement getChooseFormation(){
        return driver.findElement(ChooseFormation);
    }
    public final WebElement getChooseTW() {return  driver.findElement(ChooseTW);}
    public final WebElement getChooseRV() {return  driver.findElement(ChooseRV);}
    public final WebElement getChooseRIV() {return  driver.findElement(ChooseRIV);}
    public final WebElement getChooseLIV() {return  driver.findElement(ChooseLIV);}
    public final WebElement getChooseLV() {return  driver.findElement(ChooseLV);}
    public final WebElement getChooseRZM() {return  driver.findElement(ChooseRZM);}
    public final WebElement getChooseLZM() {return  driver.findElement(ChooseLZM);}
    public final WebElement getChooseZOM() {return  driver.findElement(ChooseZOM);}
    public final WebElement getChooseRF() {return  driver.findElement(ChooseRF);}
    public final WebElement getChooseST() {return  driver.findElement(ChooseST);}
    public final WebElement getChooseLF() {return  driver.findElement(ChooseLF);}
    public final WebElement getSearchPlayer() {return driver.findElement(SearchPlayer);}
    public final WebElement getSelectPLayer() {return driver.findElement(SelectPLayer);}
    public final WebElement getSelectKaderPlayerOne() {return driver.findElement(SelectKaderPlayerOne);}
    public final WebElement getSelectKaderPlayerTwo() {return driver.findElement(SelectKaderPlayerTwo);}
    public final WebElement getSelectPLayerEins() {return driver.findElement(SelectPlayerEins);}
    public final WebElement getSelectKaderPlayerDrei() {return driver.findElement(SelectKaderPlayerDrei);}
    public final WebElement getSelectKaderPlayerVier() {return driver.findElement(SelectKaderPlayerVier);}
}
