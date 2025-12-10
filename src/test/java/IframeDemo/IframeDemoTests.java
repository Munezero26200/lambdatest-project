package IframeDemo;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class IframeDemoTests extends BaseTests {

    @Test
    public void testIframeDemo(){
        var iframeSpace = homepage.clickIframeDemo();
        var text = iframeSpace.setContentInFrame("I'm Munezero");
        assertEquals(text,"I'm Munezero","Fail");
    }
}
