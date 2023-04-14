package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class JH_TDW_shoppingcart {
    private WebDriver driver;

    private final By PriceTag1 = By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[6]/span[2]");

    public JH_TDW_shoppingcart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void calculation_of_shoppingcart_proof() {
        driver.get("https://demowebshop.tricentis.com/cart");

            WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[6]/span[2]"));
            String text = element.getText().replaceAll("[^0-9]", "");
            double price1 = Double.parseDouble(text) / 100;

            WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[6]/span[2]"));
            String text2 = element2.getText().replaceAll("[^0-9]", "");
            double price2 = Double.parseDouble(text2) / 100;

            WebElement element3 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]/td[6]/span[2]"));
            String text3 = element3.getText().replaceAll("[^0-9]", "");
            double price3 = Double.parseDouble(text3) / 100;

            WebElement element4 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[4]/td[6]/span[2]"));
            String text4 = element4.getText().replaceAll("[^0-9]", "");
            double price4 = Double.parseDouble(text4) / 100;

            WebElement element5 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[5]/td[6]/span[2]"));
            String text5 = element5.getText().replaceAll("[^0-9]", "");
            double price5 = Double.parseDouble(text5) / 100;

            WebElement element6 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[6]/td[6]/span[2]"));
            String text6 = element6.getText().replaceAll("[^0-9]", "");
            double price6 = Double.parseDouble(text6) / 100;

            WebElement element7 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[7]/td[6]/span[2]"));
            String text7 = element7.getText().replaceAll("[^0-9]", "");
            double price7 = Double.parseDouble(text7) / 100;

            WebElement element8 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[8]/td[6]/span[2]"));
            String text8 = element8.getText().replaceAll("[^0-9]", "");
            double price8 = Double.parseDouble(text8) / 100;

            WebElement element9 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[9]/td[6]/span[2]"));
            String text9 = element9.getText().replaceAll("[^0-9]", "");
            double price9 = Double.parseDouble(text9) / 100;

            WebElement element10 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[10]/td[6]/span[2]"));
            String text10 = element10.getText().replaceAll("[^0-9]", "");
            double price10 = Double.parseDouble(text10) / 100;

            WebElement element11 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/span"));
            String text11 = element11.getText().replaceAll("[^0-9]", "");
            double totalprice = Double.parseDouble(text11) / 100;


        double price_sum = price1+price2+price3+price4+price5+price6+price7+price8+price9+price10;
        double difference = price_sum - totalprice;

        System.out.println(price_sum);
        System.out.println(totalprice);

        if (difference == 0) {
            System.out.println("Berechnung des Total-Preis stimmt!");
        }
        else {
            System.out.println("Preis stimmt nicht!");
        }

    }
    public void update_shoppingcart() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click();
    }
    public void calculation_of_shoppingcart_proof2() {
        driver.get("https://demowebshop.tricentis.com/cart");

        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[6]/span[2]"));
        String text = element.getText().replaceAll("[^0-9]", "");
        double price1 = Double.parseDouble(text) / 100;

        WebElement element2 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[6]/span[2]"));
        String text2 = element2.getText().replaceAll("[^0-9]", "");
        double price2 = Double.parseDouble(text2) / 100;

        WebElement element3 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]/td[6]/span[2]"));
        String text3 = element3.getText().replaceAll("[^0-9]", "");
        double price3 = Double.parseDouble(text3) / 100;

        WebElement element4 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[4]/td[6]/span[2]"));
        String text4 = element4.getText().replaceAll("[^0-9]", "");
        double price4 = Double.parseDouble(text4) / 100;

        WebElement element5 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[5]/td[6]/span[2]"));
        String text5 = element5.getText().replaceAll("[^0-9]", "");
        double price5 = Double.parseDouble(text5) / 100;

        WebElement element11 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/span/span"));
        String text11 = element11.getText().replaceAll("[^0-9]", "");
        double totalprice = Double.parseDouble(text11) / 100;


        double price_sum = price1+price2+price3+price4+price5;
        double difference = price_sum - totalprice;

        System.out.println(price_sum);
        System.out.println(totalprice);

        if (difference == 0) {
            System.out.println("Berechnung des Total-Preis stimmt!");
        }
        else {
            System.out.println("Preis stimmt nicht!");
        }

    }
}
