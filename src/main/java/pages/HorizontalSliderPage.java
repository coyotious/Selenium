package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private static int STEPS_PER_POINT = 2;
    private WebDriver driver;
    private By slider = By.cssSelector("input[type=range]");
    private By resultRange = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveRightSlider(double targetNumber) {
        WebElement sliderElement = driver.findElement(slider);

        for (int i = 0; i < targetNumber * STEPS_PER_POINT; i++) {
            sliderElement.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getLinkText() {
        return driver.findElement(resultRange).getText();
    }

    public String getAdaptedText(double targetNumber) {
        if (targetNumber % 1.0 != 0) {
            return String.format("%s", targetNumber);
        }

        return String.format("%.0f", targetNumber);
    }
}
