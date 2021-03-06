package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickHotSpot() {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(hotSpot)).perform();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }
}
