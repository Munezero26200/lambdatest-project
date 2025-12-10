package Checkbox;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Checkboxtests extends BaseTests {

    @Test
    public void testSingleCheckbox(){
        var checkboxSpace = homepage.clickCheckboxDemo();
        checkboxSpace.checkingBox();
        assertEquals(checkboxSpace.getResult(),"Checked!","fails");
    }
    @Test
    public  void testDisabledCheckboxes(){
        var checkboxpage = homepage.clickCheckboxDemo();
        checkboxpage.checkDisabledCheckboxes();
    }
    @Test
    public void testCheckAllBoxes(){
        var checkboxSpace = homepage.clickCheckboxDemo();
        checkboxSpace.ClickButtonToUnCheckORToCheck();

    }
}
