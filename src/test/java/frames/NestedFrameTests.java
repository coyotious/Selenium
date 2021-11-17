package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFrameTests extends BaseTests {

    @Test
    public void TestLeftFrame() {
        FramesPage framesPage = homePage.clickFrames();
        FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromLeftArea(), "LEFT", "Incorrect text in left frame");
        assertEquals(nestedFramesPage.getTextFromBottomArea(), "BOTTOM", "Incorrect text in left frame");
    }
}
