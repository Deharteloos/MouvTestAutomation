package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class MouvInfoArticlePage extends Page {

    private static final Logger LOG = LogManager.getLogger(MouvInfoArticlePage.class);

    /**
     * Find By
     */
    @FindBy(css = "#article-1-desktop + p > a")
    private WebElement LenaSituationsScholarshipLink;

    public String goToScholarship() {
        scrollToElement(LenaSituationsScholarshipLink);
        String link = LenaSituationsScholarshipLink.getAttribute("href");
        get(link);
        return link;
    }

    public boolean isTheScholarshipPageAvailable(String link) {
        return verifyLink(link);
    }

}
