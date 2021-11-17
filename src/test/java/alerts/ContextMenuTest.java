package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testContextMenu() {

        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickHotSpot();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu",
                "Incorrect message in context menu");
        contextMenuPage.alert_clickToAccept();
    }
}
