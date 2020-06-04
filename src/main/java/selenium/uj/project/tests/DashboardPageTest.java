package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.DashboardPage;
import selenium.uj.project.pages.LoginPage;
import selenium.uj.project.pages.MainPage;
import selenium.uj.project.utils.BaseProperties;

public class DashboardPageTest extends DefaultTest {

    @Test
    public void successDashboardPageTest() {
        DashboardPage dashboardPage = new DashboardPage(driver, logger)
                .clickOpenMainPage();

        Assert.assertTrue(
                dashboardPage
                        .openedMainPage()
                        .isMainPageDisplayed());
    }
}