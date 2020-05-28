package Tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class Case1_LoginTestWithValidEmailAndValidPassword extends SampleTest {

    @Test
    public void case1_LoginTestWithValidEmailAndValidPassword() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.mainPage.checkTextOnAuthenticationPage();
        user.mainPage.fillInEmailAddressField(PropertiesHelper.INSTANCE.getProperty("email"));
        user.mainPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("password"));
        user.mainPage.clickOnSignInButtonOnAlreadyRegisteredForm();
        user.mainPage.checkTextOnMyAccountPage();
    }

}
