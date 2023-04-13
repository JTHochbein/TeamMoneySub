package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.Subject;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DQA_PractisForm {
    private WebDriver driver;
    Faker faker = new Faker();
    private By first_name = By.xpath("//*[@id=\"firstName\"]");
    private By last_name = By.xpath("//*[@id=\"lastName\"]");
    private By email = By.xpath("//*[@id=\"userEmail\"]");
    private By gender_male = By.xpath("//*[@id=\"gender-radio-1\"]");
    private By gender_female = By.xpath("//*[@id=\"gender-radio-2\"]");
    private By mobile = By.xpath("//*[@id=\"userNumber\"]");
    private By date_of_birth = By.xpath("//*[@id=\"dateOfBirthInput\"]");
    private By dob_month_ddown = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
    private By dob_year_ddown = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
    private By dob_day = By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[7]");
    private By subjects = By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]");
    private By hobbies_sports = By.xpath("//*[@id=\"hobbies-checkbox-1\"]");
    private By picture_choose_picture = By.xpath("//*[@id=\"uploadPicture\"]");
    private By current_adress = By.xpath("//*[@id=\"currentAddress\"]");
    private By state_ddown = By.xpath("//*[@id=\"state\"]/div/div[1]");
    private By city_ddown = By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]");
    private By submit_btn = By.xpath("//*[@id=\"submit\"]");
    private By list = By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]");
    public DQA_PractisForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void open_url() {
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.get("https://demoqa.com/automation-practice-form");
    }
    public void fill_form() throws InterruptedException {

        this.driver.findElement(first_name).sendKeys(faker.name().firstName());
        this.driver.findElement(last_name).sendKeys(faker.name().lastName());
        this.driver.findElement(email).sendKeys("maxmusterman@mail.com");

        int x = faker.number().numberBetween(1,2);
        if (x == 1) {
            this.driver.findElement(gender_male).click();
        } else if (x == 2) {
            this.driver.findElement(gender_female).click();
        }

        this.driver.findElement(mobile).sendKeys("017912345678");
        this.driver.findElement(date_of_birth).click();

        Select drpMonth = new Select((WebElement) dob_month_ddown);
        drpMonth.selectByVisibleText("March");
        Select drpYear = new Select((WebElement) dob_year_ddown);
        drpYear.selectByVisibleText("1989");

        this.driver.findElement(dob_day).click();
        this.driver.findElement(subjects).sendKeys("EXAMPLE");
        this.driver.findElement(hobbies_sports).click();

        WebElement fileInput = driver.findElement(picture_choose_picture);
        fileInput.sendKeys(System.getProperty("user.dir/resources/pictures/picture.jpg"));

        this.driver.findElement(current_adress).sendKeys(faker.address().streetAddress()+ " "+faker.address().cityName());

        Select drpState = new Select((WebElement) state_ddown);
        drpMonth.selectByVisibleText("Haryana");
        Select drpCity = new Select((WebElement) city_ddown);
        drpYear.selectByVisibleText("Panipat");

    }
    public void click_submit() {
        this.driver.findElement(submit_btn).click();
    }
    public void list_proof() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(list));
    }

    }

