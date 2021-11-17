package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTests {

    @Test
    public void TestWysiwyg() {
        WysiwygEditorPage wisiwygEditorPage = homePage.clickWisiwygEditor();
        wisiwygEditorPage.clearEditArea();

        String inputText1 = "Text for ";
        String inputText2 = "testing";
        wisiwygEditorPage.setEditArea(inputText1);
        wisiwygEditorPage.clickIncreaseIdentButon();
        wisiwygEditorPage.setEditArea(inputText2);
        assertEquals(wisiwygEditorPage.getTextFromEditorArea(), inputText1+inputText2,
                "Incorrect input text");
    }
}
