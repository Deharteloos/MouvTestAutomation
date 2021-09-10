package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class VoiceAssistanPage extends Page {

    private static final Logger LOG = LogManager.getLogger(VoiceAssistanPage.class);

    /**
     * Find By
     */
    @FindBy(css = ".article-main-section")
    private WebElement articleSection;

    @FindBy(css = "#article-1-desktop + h2 + p > a")
    private WebElement skillMouvLink;

    public String clickOnSkillMouv() {
        shortWait.until(visibilityOf(articleSection));
        scrollToElement(skillMouvLink);
        String link = skillMouvLink.getAttribute("href");
        get(link);
        return link;
    }

    public boolean pageFound(String link) {
        return verifyLink(link);
    }

}
