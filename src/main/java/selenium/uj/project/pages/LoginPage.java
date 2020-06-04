package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DefaultPage {

    @FindBy(id = "username")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-submit")
    private WebElement submitButton;

    public LoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public LoginPage fillLoginForm(String email) {
        fillElement(emailField, email);
        return this;
    }
    public LoginPage fillPasswordForm(String password){
        fillElement(passwordField, password);
        return this;
    }
    public LoginPage clickLoginButton(){
        clickElement(submitButton);
        return this;
    }
    public DashboardPage submitLoginForm() {
        clickElement(submitButton);
        return new DashboardPage(driver, logger);
    }


}