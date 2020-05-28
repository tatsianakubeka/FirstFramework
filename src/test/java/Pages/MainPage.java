package Pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends BasePage{

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButtonOnAlreadyRegisteredForm;

    @FindBy(id = "email")
    private WebElement emailAddressField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy (xpath = "//*[@id='create-account_form']/div/p")
    private WebElement createAnAccountText;

    @FindBy (xpath = "//*[@id='center_column']/p")
    private WebElement myAccountText;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        open();
    }

    public void clickOnSignInButton() {
        element(signInButton).click();
    }

    public void clickOnSignInButtonOnAlreadyRegisteredForm() {
        element(signInButtonOnAlreadyRegisteredForm).click();
    }

    public void fillInEmailAddress (String email) {
        element(emailAddressField).sendKeys(email);
    }

    public void checkTextOnAuthenticationPage() {
        String text = element(createAnAccountText).getText();
        System.out.println(text);
        Pattern pattern = Pattern.compile("(^Please\\senter\\s)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found");
        } else {
            System.out.println("Have not found");
        }
    }

    public void checkTextOnMyAccountPage() {
        String text = element(myAccountText).getText();
        System.out.println(text);
        Pattern pattern = Pattern.compile("(^Welcome\\sto\\syour\\s)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("_Have found");
        } else {
            System.out.println("_Have not found");
        }
    }

    public void fillInEmailAddressField(String email) {
        element(emailAddressField).sendKeys(email);
    }

    public void fillInPasswordField(String password) {
        element(passwordField).sendKeys(password);
    }

}
