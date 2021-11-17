package ForgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testSuccessfulRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setUserEmail("someemail@mail.com");
        forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(forgotPasswordPage.getAlerttext().contains("Internal Server Error"),
                "Message text is incorrect");
    }
}
