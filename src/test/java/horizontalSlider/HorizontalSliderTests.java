package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSlider() {

        double targetNumber = 4;
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveRightSlider(targetNumber);
        assertEquals(horizontalSliderPage.getLinkText(),
                horizontalSliderPage.getAdaptedText(targetNumber));
    }
}
