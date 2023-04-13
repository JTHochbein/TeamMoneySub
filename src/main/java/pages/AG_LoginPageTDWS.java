package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AG_LoginPageTDWS {


    public  WebDriver driver;
    public By notebooks = By.linkText("Notebooks");
    public By firstNotebook = By.xpath("//div[@class='item-box'][1]//a[@class='product-title']");
    public By addToCart = By.id("add-to-cart-button-31");
    public By computers = By.linkText("Computers");
    public By desktops = By.linkText("Desktops");
    public By allInOne = By.linkText("All-In-One");
    public By allInOneProduct = By.xpath("//a[contains(text(),'HP Omni 220')]//parent::h2//following-sibling::div[@class='buttons']//input[@value='Add to cart']");
    public By firstName = By.id("BillingNewAddress_FirstName");
    public By lastName = By.id("BillingNewAddress_LastName");
    public By giftCard = By.xpath("//input[@id='product_attribute_8_10_22']");
    public By checkout = By.xpath("//span[text()='Checkout']");
    public By agreeCheckBox = By.id("termsofservice");
    public By checkoutButton = By.id("checkout");
    public By successMessage = By.xpath("//div[@class='section order-completed']/div[@class='title']/strong");

    public AG_LoginPageTDWS(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToNotebooksPage() {
        driver.findElement(notebooks).click();
    }

    public void selectFirstNotebook() {
        driver.findElement(firstNotebook).click();
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }

    public void navigateToAllInOnePage() {
        driver.findElement(computers).click();
        driver.findElement(desktops).click();
        driver.findElement(allInOne).click();
    }

    public void selectAllInOneProduct() {
        driver.findElement(allInOneProduct).click();
    }

    public void enterFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void enterLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void selectGiftCard() {
        driver.findElement(giftCard).click();
    }

    public void clickOnCheckout() {
        driver.findElement(checkout).click();
    }

    public void agreeToTermsAndConditions() {
        driver.findElement(agreeCheckBox).click();
    }

    public void clickOnCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

    public String getSuccessMessage() {
       // WebDriverWait wait = new WebDriverWait(driver, 10);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
        return driver.findElement(successMessage).getText();
    }
}
