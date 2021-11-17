package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrokenImagesPage {

    private WebDriver driver;
    private By statusAlert = By.cssSelector("body");

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }
}
