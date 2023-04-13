package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OMB_MS873_InvestmentPage {

    WebDriver driver;
    String selectInvestmentMonths = "12";
    By investmentAmount = By.id("investmentAmount");
    By investmentDuration = By.name("investmentDuration");
    By submitButton = By.name("submitButton");
    public static By banksBlock = By.cssSelector(".bc-product-teaser:nth-child(4) .bc-product-teaser__block > .bc-headline");
    By banks1Interest = By.cssSelector(".bc-product-teaser:nth-child(4) .bc-product-teaser__interest");
    By banks1profit = By.cssSelector(".bc-product-teaser:nth-child(4) .bc-product-teaser__profit");
    By banks2Name = By.cssSelector(".bc-product-teaser:nth-child(5) .bc-product-teaser__block > .bc-headline");
    By banks2Interest = By.cssSelector(".bc-product-teaser:nth-child(5) .bc-product-teaser__interest");
    By banks2Profit = By.cssSelector(".bc-product-teaser:nth-child(5) .bc-product-teaser__profit");
    By banks3Name = By.cssSelector(".bc-product-teaser:nth-child(6) .bc-product-teaser__block > .bc-headline");
    By banks3Interest = By.cssSelector(".bc-product-teaser:nth-child(6) .bc-product-teaser__interest");
    By banks3Profit = By.cssSelector(".bc-product-teaser:nth-child(6) .bc-product-teaser__profit");

    public OMB_MS873_InvestmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public By getByInvestmentAmount() {
        return investmentAmount;
    }

    public WebElement getInvestmentAmount() {
        return driver.findElement(investmentAmount);
    }

    public void setInvestmentDuration() {
        WebElement selectElement = driver.findElement(investmentDuration);
        Select select = new Select(selectElement);
        select.selectByValue(selectInvestmentMonths);
    }
    public String getSelectInvestmentMonths() {
        return selectInvestmentMonths;
    }
    public WebElement getSubmitButton() {
        return driver.findElement(submitButton);
    }

    public WebElement getBanksBlock() {
        return driver.findElement(banksBlock);
    }

    public WebElement getBanks1Interest() {
        return driver.findElement(banks1Interest);
    }

    public WebElement getBanks1profit() {
        return driver.findElement(banks1profit);
    }

    public WebElement getBanks2Name() {
        return driver.findElement(banks2Name);
    }

    public WebElement getBanks2Interest() {
        return driver.findElement(banks2Interest);
    }

    public WebElement getBanks2Profit() {
        return driver.findElement(banks2Profit);
    }

    public WebElement getBanks3Name() {
        return driver.findElement(banks3Name);
    }

    public WebElement getBanks3Interest() {
        return driver.findElement(banks3Interest);
    }

    public WebElement getBanks3Profit() {
        return driver.findElement(banks3Profit);
    }
}
