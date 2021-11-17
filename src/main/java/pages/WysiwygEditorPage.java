package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIdentButon = By.cssSelector("button[aria-label=\"Increase indent\"]");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearEditArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setEditArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditorArea() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void clickIncreaseIdentButon() {
        driver.findElement(increaseIdentButon).click();
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorFrameId);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
