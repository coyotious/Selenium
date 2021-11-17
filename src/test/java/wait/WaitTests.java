package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingAfter;
import pages.DynamicLoadingHidden;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void waitTestUntilHidden() {
        DynamicLoadingHidden dynamicLoadingHidden =
                homePage.clickDynamicLoading().clickExampleHidden();
        dynamicLoadingHidden.clickStartButton();
        assertEquals(dynamicLoadingHidden.getText(), "Hello World!",
                "Incorrect loaded text");
    }

    @Test
    public void waitTestRenderedAfter() {
        DynamicLoadingAfter dynamicLoadingAfter =
                homePage.clickDynamicLoading().clickExampleAfter();
        dynamicLoadingAfter.clickStartButton();
        assertEquals(dynamicLoadingAfter.getText(), "Hello World!",
                "Incorrect afterText");
    }
}
