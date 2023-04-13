package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AG_SeleniumKursDragDropPage {

    WebDriver driver;

    @FindBy(id = "white-logo")
    WebElement drglogoWhite;

    @FindBy(id = "blue-logo")
    WebElement drglogoBlue;

    @FindBy(id = "red-logo")
    WebElement drglogoRed;

    @FindBy(id = "green-logo")
    WebElement drglogoGreen;

    @FindBy(id = "droppable")
    WebElement dropBox;

    @FindBy(id = "coding-logo")
    WebElement drgCodeLogo;

    @FindBy(css = "#droppable > p")
    WebElement textStatusMessage;

    public AG_SeleniumKursDragDropPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Standard Drag and Drop
    public void moveAllLogosToBox() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drglogoWhite, dropBox).build().perform();
        actions.dragAndDrop(drglogoBlue, dropBox).build().perform();
        actions.dragAndDrop(drglogoRed, dropBox).build().perform();
        actions.dragAndDrop(drglogoGreen, dropBox).build().perform();
        actions.dragAndDrop(drgCodeLogo, dropBox).build().perform();

    }

    // Standard Drang and Drop
    public void moveWhiteLogoToBox() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drglogoWhite, dropBox).perform();
    }

    public void moveRedLogoToBox() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drglogoRed, dropBox).perform();
    }

    public void moveBlueLogoToBox() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drglogoBlue, dropBox).perform();
    }

    public void moveGreenLogoToBox() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drglogoGreen, dropBox).perform();
    }

    // Drag and Drop By Offset
    public void moveWhiteLogoToPoint(int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(drglogoWhite, x, y).build().perform();
    }

    public void moveBlueLogoToPoint(int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(drglogoBlue, x, y).build().perform();

    }

    public void moveRedLogoToPoint(int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(drglogoRed, x, y).build().perform();
    }

    public void moveGreenLogoToPoint(int x, int y) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(drglogoGreen, x, y).build().perform();
    }

    //Drag an Drop Manuell

    public void moveWhiteLogoToBoxManuell(int x, int y) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(drglogoWhite).perform();
        actions.moveByOffset(250,0).perform();
        actions.release(drglogoWhite);


}
    public void moveBlueLogoToBoxManuell(int x, int y) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(drglogoBlue).perform();
        actions.moveByOffset(250, 0).perform();
        actions.release(drglogoBlue);

    }
    public void moveRedLogoToBoxManuell(int x, int y) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(drglogoRed).perform();
        actions.moveByOffset(250,0).perform();
        actions.release(drglogoRed);
}
    public void moveGreenLogoToBoxManuell(int x, int y) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(drglogoGreen).perform();
        actions.moveByOffset(250, 0).perform();
        actions.release(drglogoGreen);
    }

    public String printstatusMessage() {
        return textStatusMessage.getText();
    }

    public void moveGreenLogoToBoxManuell() {
    }
}






