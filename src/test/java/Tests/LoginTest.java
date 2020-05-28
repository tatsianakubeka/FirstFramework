package Tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class LoginTest extends SampleTest {

    @Test
    public void loginTest() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        //user.mainPage.fillInEmailAddressField("automationstep@gmail.com");
        user.mainPage.checkText();
        user.mainPage.fillInEmailAddressField(PropertiesHelper.INSTANCE.getProperty("email"));
        user.mainPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("password"));
    }


}
