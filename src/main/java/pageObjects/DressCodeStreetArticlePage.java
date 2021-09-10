package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class DressCodeStreetArticlePage extends Page {

    private static final Logger LOG = LogManager.getLogger(DressCodeStreetArticlePage.class);

    /**
     * Find By
     */
    @FindBy(css = ".markdown > p:nth-child(2) >a")
    private WebElement socialLink;

    public void clickOnSocialLink() {
        scrollToElement(socialLink);
        clickOn(socialLink);
    }

    public boolean isSocialLinkWorking() {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.close();
        driver.switchTo().window(tabs.get(1));
        saveScreenShotPNG();
        return !driver.getCurrentUrl().equals("about:blank#blocked");
    }

}
