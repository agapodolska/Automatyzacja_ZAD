package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesDashboard extends DefaultPage {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[3]/span/div[2]/span[2]/div/span/div")
    private WebElement shareButton;

    public NotesDashboard(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isNotesDashboardDisplayed() {
        return isElementDisplayed(shareButton);
    }

}
