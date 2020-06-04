package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends DefaultPage {

    @FindBy(xpath = "//html/body/div[1]/div[2]/div/div[3]/div/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/a")
    private WebElement openMyPageButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/a/div/div[1]")
    private WebElement confluenceIcon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div/header/nav/div[3]/div[6]/div/div/button[1]/span/span")
    private WebElement createButton;

    public MainPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public MainPage clickAddMyPage() {
        clickElement(createButton);
        return new MainPage(driver, logger);
    }
      public AddNotesPage openAddMyPage() {
        clickElement(createButton);
        return new AddNotesPage(driver, logger);
      }

    public boolean isMainPageDisplayed() {
        return isElementDisplayed(confluenceIcon);
    }

    public AddNotesPage clickCreateMyPage() {
        clickElement(openMyPageButton);
        return new AddNotesPage(driver, logger);
    }
}
