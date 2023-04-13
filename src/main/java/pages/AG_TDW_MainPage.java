package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AG_TDW_MainPage {

    private WebDriver driver;
By Notebooks =By.xpath("//a[@class='hover'][normalize-space()='Notebooks']");
    public AG_TDW_MainPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement Notebooks()
    {
        return  driver.findElement(Notebooks);
}
    public WebElement AddToCart()
        {
            return  driver.findElement(By.xpath("//input[@value='Add to cart']"));

        }

    public WebElement giftCard() {
        return driver.findElement(By.xpath("//input[@value='Gift Card']"));
    }

    public WebElement firstName() {
        return driver.findElement(By.xpath("//input[@name='firstname']"));
    }

    public WebElement lastName() {
        return driver.findElement(By.xpath("//input[@name='lastname']"));
    }

    public WebElement thirdCategory() {
        return driver.findElement(By.xpath("//ul[@class='menu cf']/li[3]/a/span"));
    }

    public WebElement thirdCategoryThirdItem() {
        return driver.findElement(By.xpath("//div[@class='row cf products-list']/div[3]//input[@value='Add to cart']"));
    }

    public WebElement checkoutButton() {
        return driver.findElement(By.xpath("//div[@class='page-content']//a[@class='checkout-button button alt wc-forward']"));
    }

}





