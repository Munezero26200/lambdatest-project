package UploadFile;

import Tests.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTests extends BaseTests {

    @Test
    public void testUploadFile(){
        var uploadFileSpace = homepage.clickUploadFileDemo();
        uploadFileSpace.uploadObject("C:\\Users\\Admin\\Pictures\\Screenshots\\diaspora3.png");
        assertEquals(uploadFileSpace.getResultText(), "File Successfully Uploaded","fails");
    }
}
