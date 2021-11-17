package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By linkText = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames() {
        clickLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public class NestedFramesPage {
        private WebDriver driver;
        private String frameLeft = "frame-left";
        private String frameBottom = "frame-bottom";
        private String frameTop = "frame-top";
        private By body = By.cssSelector("body");

        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;
        }

        public String getTextFromLeftArea() {
            switchToTopArea();
            switchToLeftArea();
            String text = driver.findElement(body).getText();
            switchToMainArea();
            switchToMainArea();
            return text;
        }

        public String getTextFromBottomArea() {
            switchToBottomArea();
            String text = driver.findElement(body).getText();
            switchToMainArea();
            return text;
        }

        public void switchToLeftArea() {
            driver.switchTo().frame(frameLeft);
        }

        public void switchToBottomArea() {
            driver.switchTo().frame(frameBottom);
        }

        public void switchToTopArea() {
            driver.switchTo().frame(frameTop);
        }

        public void switchToMainArea() {
            driver.switchTo().parentFrame();
        }
    }
}
