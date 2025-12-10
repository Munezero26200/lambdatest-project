package ContextMenu;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuPageTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuSpace = homepage.clickContextMenu();
        contextMenuSpace.clickOnBox();
        assertEquals(contextMenuSpace.handlePopUpMessage(), "You selected a context menu", "Fail");
    }
}
