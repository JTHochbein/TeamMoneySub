package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class JH_TDW_Homepage {
    private WebDriver driver;

    private final By bluejeans_atc_button = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
    private final By shoppingcart_button = By.xpath("//span[normalize-space()='Shopping cart']");
    private final By addtocart_proof = By.xpath("//p[@class='content']");
    private final By shoppingcart_proof = By.xpath("//th[normalize-space()='Product(s)']");
    private final By computingandinternet_atc_btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input");
    private final By fiction_atc_btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
    private final By healtbook_atc_btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/div[3]/div[2]/input");
    private final By casualgolfbelt_atc_btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div[2]/input");
    private final By genuineleatherhandbag_atc_btn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[7]/div/div[2]/div[3]/div[2]/input");
    public JH_TDW_Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openurl() {
        this.driver.get("https://demowebshop.tricentis.com/");
    }
    public void openurl_books() {
        this.driver.get("https://demowebshop.tricentis.com/books");
    }
    public void openurl_apparel_shoes() {
        this.driver.get("https://demowebshop.tricentis.com/apparel-shoes");
    }

    public void add_five_articles() throws InterruptedException {
        openurl_books();
        healthbook_atc();
        Thread.sleep(500);
        atc_proof();
        Thread.sleep(500);
        fiction_atc();
        atc_proof();
        Thread.sleep(500);
        computingandinternet_atc();
        atc_proof();
        Thread.sleep(500);
        openurl_apparel_shoes();
        bluejeans_atc();
        Thread.sleep(500);
        atc_proof();
        Thread.sleep(500);
        casualgolfbelt_atc();
        atc_proof();
        Thread.sleep(500);

    }








    public void bluejeans_atc() {
        this.driver.findElement(bluejeans_atc_button).click();
    }
    public void shoppingcart_click() {

        this.driver.findElement(shoppingcart_button).click();
    }
    public void atc_proof() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addtocart_proof));
    }
    public void shoppingcart_proof() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingcart_proof));
    }
    public void computingandinternet_atc() {
        this.driver.findElement(computingandinternet_atc_btn).click();
    }
    public void fiction_atc() {
        this.driver.findElement(fiction_atc_btn).click();
    }
    public void healthbook_atc() {
        this.driver.findElement(healtbook_atc_btn).click();
    }
    public void casualgolfbelt_atc() {
        this.driver.findElement(casualgolfbelt_atc_btn).click();
    }
    public void genuineleatherhandbag_atc() {
        this.driver.findElement(genuineleatherhandbag_atc_btn).click();
    }
    public void add_rdm_amount_articles() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Random random = new Random();
        int x = random.nextInt(6)+1;
        if (x == 1) {
            driver.get("https://demowebshop.tricentis.com/books");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fiction_atc_btn));
            fiction_atc();
        }
        if (x==2) {
            driver.get("https://demowebshop.tricentis.com/books");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fiction_atc_btn));
            fiction_atc();
            computingandinternet_atc();
        }
        if (x==3) {
            driver.get("https://demowebshop.tricentis.com/books");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fiction_atc_btn));
            fiction_atc();
            computingandinternet_atc();
            healthbook_atc();
        }
       if (x==4) {
            driver.get("https://demowebshop.tricentis.com/books");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fiction_atc_btn));
            fiction_atc();
            computingandinternet_atc();
            healthbook_atc();
            driver.get("https://demowebshop.tricentis.com/apparel-shoes");
            WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(bluejeans_atc_button));
            bluejeans_atc();
        }
        if (x==5) {
            driver.get("https://demowebshop.tricentis.com/books");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fiction_atc_btn));
            fiction_atc();
            computingandinternet_atc();
            healthbook_atc();
            driver.get("https://demowebshop.tricentis.com/apparel-shoes");
            WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(bluejeans_atc_button));
            bluejeans_atc();
            casualgolfbelt_atc();
        }
        if (x == 6) {
            driver.get("https://demowebshop.tricentis.com/books");
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fiction_atc_btn));
            fiction_atc();
            computingandinternet_atc();
            healthbook_atc();
            driver.get("https://demowebshop.tricentis.com/apparel-shoes");
            WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(bluejeans_atc_button));
            bluejeans_atc();
            casualgolfbelt_atc();
            genuineleatherhandbag_atc();
            atc_proof();
        }

    }

}
