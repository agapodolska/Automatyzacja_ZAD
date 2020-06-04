package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends DefaultPage {

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/div/div[2]/div/div[1]/div/div/span")
    private WebElement userMenuButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/div/div/div[3]/div/div[2]/a[1]/div[1]")
    private WebElement confluenceMenuItem;

    public DashboardPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public boolean isDashboardPageDisplayed() {
        return isElementDisplayed(userMenuButton);
    }

    public DashboardPage clickOpenMainPage() {
        clickElement(confluenceMenuItem);
        return new DashboardPage(driver, logger);
    }

    public MainPage openedMainPage() {
        clickElement(confluenceMenuItem);
        return new MainPage(driver, logger);
    }

}
