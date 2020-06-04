package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.AddNotesPage;
import selenium.uj.project.utils.BaseProperties;

public class AddNotesPageTest extends DefaultTest{
    @Test
    public void createdNotesPageTest() {
        AddNotesPage addNotesPage = new AddNotesPage(driver, logger)
                .clickFillFilterButton()
                .fillFilterForm(BaseProperties.TEST_SEARCH_VALUE)
                .clickCreateNotesButton();


        Assert.assertTrue(
                addNotesPage
                        .openNotesPage()
                        .isNotesPageDisplayed());
    }
}
