package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.LoginPage;
import selenium.uj.project.utils.BaseProperties;

import java.util.Date;

public class LoginTest extends DefaultTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver, logger)
                .fillLoginForm(BaseProperties.BASE_ADMIN_EMAIL)
                .clickLoginButton()
                .fillPasswordForm(BaseProperties.BASE_ADMIN_PASSWORD);

        Assert.assertTrue(
                loginPage
                        .submitLoginForm()
                        .isDashboardPageDisplayed());
    }
}