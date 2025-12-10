package HoverDemo;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HoverDemoTests extends BaseTests {
    @Test
    public void testHoverLeftButton(){
        var hoverSpace = homepage.clickHoverDemo();
        assertTrue(hoverSpace.HoverOntoButtonAndCheckColorLeftButton(),"Color didn't change" );
    }
    @Test
    public void testHoverRightButton(){
        var hoverSpace = homepage.clickHoverDemo();
        assertTrue(hoverSpace.HoverOntoButtonAndCheckColorRightButton(),"Color didn't change");
    }

}
