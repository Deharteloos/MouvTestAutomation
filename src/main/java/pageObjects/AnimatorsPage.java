package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnimatorsPage extends Page {

    private static final Logger LOG = LogManager.getLogger(AnimatorsPage.class);

    /**
     * Find By
     */
    @FindBy(css = ".animators-title + a")
    private WebElement ahmed;

    public void clickOnAhmed() {
        scrollToElement(ahmed);
        clickOn(ahmed);
    }

}
