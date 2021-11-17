package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class UploadTest extends BaseTests {

    @Test
    public void testFileUpload() {
        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/User/Desktop/Java/FileForUpload.txt");
        assertEquals(uploadPage.getUploadedFiles(), "FileForUpload.txt",
                "Uploaded file test failed");
    }
}
