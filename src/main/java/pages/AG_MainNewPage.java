package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AG_MainNewPage {

    private WebDriver driver;

    public AG_MainNewPage(WebDriver driver) {
        this.driver = driver;
    }
    private By notebooks = By.linkText("Notebooks");
    private By firstNotebook = By.xpath("//div[@class='item-box'][1]//a[@class='product-title']");
    private By addToCart = By.id("add-to-cart-button-31");
    private By computers = By.linkText("Computers");
    private By desktops = By.linkText("Desktops");
    private By allInOne = By.linkText("All-In-One");
    private By allInOneProduct = By.xpath("//a[contains(text(),'HP Omni 220')]//parent::h2//following-sibling::div[@class='buttons']//input[@value='Add to cart']");
    private By firstName = By.id("BillingNewAddress_FirstName");
    private By lastName = By.id("BillingNewAddress_LastName");
    private By giftCard = By.xpath("//input[@id='product_attribute_8_10_22']");
    private By checkout = By.xpath("//span[text()='Checkout']");
    private By agreeCheckBox = By.id("termsofservice");
    private By checkoutButton = By.id("checkout");
    private By successMessage = By.xpath("//div[@class='section order-completed']/div[@class='title']/strong");

    public void ShoppingPage(WebDriver driver) {
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
        return driver.findElement(successMessage).getText();
    }

}
