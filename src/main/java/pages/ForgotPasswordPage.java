package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private static final By SERVER_ERROR = By.cssSelector("body");
    private By retrievePasswordField = By.id("email");
    private By retrievePasswordButton = By.cssSelector("#content button");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserEmail(String userEmail) {
        driver.findElement(retrievePasswordField).sendKeys(userEmail);
    }

    public void clickRetrievePasswordButton() {
        driver.findElement(retrievePasswordButton).click();
    }

    public String getAlerttext() {
        return driver.findElement(SERVER_ERROR).getText();
    }
}
