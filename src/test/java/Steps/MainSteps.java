package Steps;

import Pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainSteps extends ScenarioSteps {

    private MainPage onPage;

    @Step
    public void clickOnSignInButton() {
        onPage.clickOnSignInButton();
    }

    @Step
    public void clickOnSignInButtonOnAlreadyRegisteredForm() {
        onPage.clickOnSignInButtonOnAlreadyRegisteredForm();
    }

    @Step
    public void openMainPage() {
        onPage.openMainPage();
    }

    @Step
    public void fillInEmailAddressField(String email) {
        onPage.fillInEmailAddressField(email);
    }

    @Step
    public void fillInPasswordField(String password) {
        onPage.fillInPasswordField(password);
    }

    @Step
    public void checkTextOnAuthenticationPage() {
        onPage.checkTextOnAuthenticationPage();
    }

    @Step
    public void checkTextOnMyAccountPage() {
        onPage.checkTextOnMyAccountPage();
    }
}
