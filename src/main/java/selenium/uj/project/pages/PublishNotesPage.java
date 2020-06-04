package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishNotesPage extends DefaultPage{
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/textarea")
    private WebElement notesWindow;

    @FindBy (id="publish-button")
    private WebElement publishButton;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[3]/div[2]/div[1]/div/span[3]/span/div[2]/span[2]/div/span/div/button/span/span/span")
    private WebElement shareButton;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/textarea")
    private WebElement addTitle;

    public PublishNotesPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isNotesPageDisplayed() {
        return isElementDisplayed(notesWindow);
    }

    public PublishNotesPage fillTitle(String title) {
        fillElement(addTitle, title);
        return this;
    }

    public PublishNotesPage clickPublishButton(){
        clickElement(publishButton);
        return this;
    }

    public NotesDashboard openNotesDashboard() {
        clickElement(publishButton);
        return new NotesDashboard(driver, logger);
    }

    //public boolean isInfoBoxDisplayed(){return isElementDisplayed(infoBox);}
}
