package selenium.uj.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.uj.project.pages.AddNotesPage;
import selenium.uj.project.pages.PublishNotesPage;
import selenium.uj.project.utils.BaseProperties;

public class PublishNotesPageTest extends DefaultTest{
    @Test
    public void publishedNotesPageTest() {
        PublishNotesPage publishNotesPage = new PublishNotesPage(driver, logger)
                .fillTitle(BaseProperties.NEW_TITLE)
                .clickPublishButton();

        Assert.assertTrue(
                publishNotesPage
                        .openNotesDashboard()
                        .isNotesDashboardDisplayed());
    }
}
