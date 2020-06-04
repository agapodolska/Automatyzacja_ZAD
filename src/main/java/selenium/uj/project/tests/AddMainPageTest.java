package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.MainPage;

public class AddMainPageTest extends DefaultTest {
    @Test
    public void successMainPageTest() {
        MainPage mainPage = new MainPage(driver, logger)
                .clickAddMyPage();

        Assert.assertTrue(
                mainPage
                        .openAddMyPage()
                        .isCreateWindowDisplayed());
    }
}
