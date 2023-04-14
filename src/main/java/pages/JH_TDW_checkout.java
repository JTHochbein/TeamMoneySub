package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JH_TDW_checkout {
    private WebDriver driver;

    String email = "maxmusterman@email.com";
    String passwort = "passwort";

    private By tos_box = By.xpath("//input[@id='termsofservice']");
    private By checkout_btn = By.xpath("//button[@id='checkout']");
    private By checkout_asguest_btn = By.xpath("//input[@value='Checkout as Guest']");
    private By email_field = By.xpath("//input[@id='Email']");
    private By password_field = By.xpath("//input[@id='Password']");
    private By login_btn = By.xpath("//input[@value='Log in']");
    private By billingadress_continue = By.xpath("//input[@onclick='Billing.save()']");
    private By shippingadress_continue = By.xpath("//input[@onclick='Shipping.save()']");
    private By shippingmethod_continue = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
    private By paymentmethod_continue = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    private By paymentinfo_continue = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    private By confirmorder_continue = By.xpath("//input[@value='Confirm']");

    private By checkout_proof = By.xpath("//h1[normalize-space()='Thank you']");
    private By ordernumber_proof = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]");

    public JH_TDW_checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accept_tos() {
         this.driver.findElement(tos_box).click();
    }
    public void checkout_btn_click() {
        this.driver.findElement(checkout_btn).click();
    }
    public void setCheckout_asguest_btn_click() {
        this.driver.findElement(checkout_asguest_btn).click();
    }
    public void login_process() throws InterruptedException {
        this.driver.findElement(email_field).sendKeys(email);
        this.driver.findElement(password_field).sendKeys(passwort);
        this.driver.findElement(login_btn).click();

    }

    public void checkout_loggedin_checkout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(billingadress_continue));
        this.driver.findElement(billingadress_continue).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(shippingadress_continue));
        this.driver.findElement(shippingadress_continue).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(shippingmethod_continue));
        this.driver.findElement(shippingmethod_continue).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentmethod_continue));
        this.driver.findElement(paymentmethod_continue).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentinfo_continue));
        this.driver.findElement(paymentinfo_continue).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmorder_continue));
        this.driver.findElement(confirmorder_continue).click();
    }
    public void verification_checkout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkout_proof));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ordernumber_proof));
        WebElement liElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]"));
        WebElement order_number = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]"));
        String liText = order_number.getText();
        String orderNumber = liText.substring(liText.indexOf(":") + 2);
        System.out.println("Order number: " + orderNumber);
        System.out.println("Test erfolgreich!");
    }



}
