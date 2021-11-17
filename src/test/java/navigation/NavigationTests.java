package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingHidden;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void TestNavigator() {
        homePage.clickDynamicLoading().clickExampleHidden();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testDynamicLoadingNewTab() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingHidden dynamicLoadingHidden = dynamicLoadingPage.clickExampleHiddenNewTab();
        dynamicLoadingHidden.clickStartButton();
        assertEquals(dynamicLoadingHidden.getText(), "Hello World!",
                "Incorrect loaded text");

    }
}
