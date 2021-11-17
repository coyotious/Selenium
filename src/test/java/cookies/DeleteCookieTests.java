package cookies;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class DeleteCookieTests extends BaseTests {

    @Test
    public void testDeleteCookie() {
        String cookieName = "optimizelyPendingLogEvents";
        homePage.deleteCookie(cookieName);
        assertEquals(homePage.isCookieExist(cookieName), false, "Cookie wasn't deleted");
    }
}
