package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDOM().scrollToTable();
    }

    @Test
    public void testInfiniteScroll() {
        homePage.clickInfinite().scrollToParagraph(4);
    }
}
