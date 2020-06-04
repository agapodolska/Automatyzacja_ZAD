package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNotesPage extends DefaultPage {


    @FindBy(xpath = "/html/body/div[3]/div/h2")
    private WebElement createDialogWindow;

    @FindBy(id = "createDialogFilter")
    private WebElement createDialogFilter;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/button")
    private WebElement createNotesButton;


    public AddNotesPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public AddNotesPage fillFilterForm(String filter) {
        fillElement(createDialogFilter, filter);
        return this;
    }

    public AddNotesPage clickFillFilterButton(){
        clickElement(createDialogFilter);
        return this;
    }

    public AddNotesPage clickCreateNotesButton(){
        clickElement(createNotesButton);
        return this;
    }

    public PublishNotesPage openNotesPage() {
        clickElement(createNotesButton);
        return new PublishNotesPage(driver, logger);
    }


    public boolean isCreateWindowDisplayed() {
        return isElementDisplayed(createDialogWindow);
    }
}
