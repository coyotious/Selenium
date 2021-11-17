package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.WindowManager;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpathFormat1 = ".//a[contains(text(), 'Example 1')]";
    private By linkForHidden = By.xpath(linkXpathFormat1);
    private String linkXpathFormat2 = ".//a[contains(text(), 'Example 2')]";
    private By linkForAfter = By.xpath(linkXpathFormat2);

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingHidden clickExampleHidden() {
        driver.findElement(linkForHidden).click();
        return new DynamicLoadingHidden(driver);
    }

    public DynamicLoadingHidden clickExampleHiddenNewTab() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL).build().perform();
        driver.findElement(linkForHidden).click();
        actions.keyUp(Keys.LEFT_CONTROL).build().perform();
        WindowManager manager = new WindowManager(driver);
        manager.goTo("https://google.com");
        manager.switchToTab("The Internet");
        return new DynamicLoadingHidden(driver);
    }

    public DynamicLoadingAfter clickExampleAfter() {
        driver.findElement(linkForAfter).click();
        return new DynamicLoadingAfter(driver);
    }
}
