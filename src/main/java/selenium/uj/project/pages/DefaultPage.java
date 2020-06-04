package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import selenium.uj.project.utils.CustomTestLog;

public abstract class DefaultPage {

    protected WebDriver driver;
    protected Logger logger;

    protected DefaultPage(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.logger = logger;
        PageFactory.initElements(this.driver, this);
    }

    protected void fillElement(WebElement element, String value) {

        logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.CLEAR_ACTION));
        element.clear();

        logger.info(CustomTestLog.getElementMessage(element, value, CustomTestLog.FILL_ACTION));
        element.sendKeys(value);
    }


    protected void clickElement(WebElement element) {

        logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.CLICK_ACTION));
        element.click();
    }

    /**protected void selectCheckbox(WebElement element, boolean checked) {

        if (!element.isSelected()) {
            if (checked) {
                logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.CLICK_ACTION));
                element.click();
            }
        } else {
            if (!checked) {
                logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.CLICK_ACTION));
                element.click();
            }
        }
    }**/

    protected boolean isElementDisplayed(WebElement element) {


        logger.info(CustomTestLog.getElementMessage(element, CustomTestLog.IS_DISPLAYED_ACTION));
        return element.isDisplayed();
    }
}