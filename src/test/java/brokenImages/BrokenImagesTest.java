package brokenImages;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BrokenImagesPage;
import static org.testng.Assert.assertTrue;

public class BrokenImagesTest extends BaseTests {

    public static final String BROKEN_IMAGE_TEXT = "Broken Images";


    @Test
    public void testBrokenImages() {

        BrokenImagesPage brokenImagesPage = homePage.clickBrokenImagesPage();
        assertTrue(brokenImagesPage.getAlertText()
                        .contains(BROKEN_IMAGE_TEXT),
                "Alert text is incorrect");
    }
}
