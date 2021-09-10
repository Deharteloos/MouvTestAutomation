package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AhmedPage extends Page {

    private static final Logger LOG = LogManager.getLogger(AhmedPage.class);

    /**
     * Find By
     */
    @FindBy(css = ".teasers-block-vertical")
    private WebElement latestNewsBlock;

    @FindBy(css = ".personality-main-container-main-content")
    private WebElement latestNewsSection;

    public boolean isLatestNewsSectionEmpty() {
        try {
            scrollToElement(latestNewsSection);
            saveScreenShotPNG();
            latestNewsBlock.isDisplayed();
            return false;
        } catch (NoSuchElementException ex) {
            return true;
        }
    }

}
