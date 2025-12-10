package FileDownload;

import Tests.BaseTests;
import org.testng.annotations.Test;

public class FileDownloadTests extends BaseTests {
    @Test
    public void testFileDownload(){
        var fileDownloadSpace = homepage.clickFileDownload();
        fileDownloadSpace.enterTextIntoTextArea("Download");
    }
}
