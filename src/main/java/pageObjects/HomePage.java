package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Calendar;

public class HomePage extends Page {

    private static final Logger LOG = LogManager.getLogger(HomePage.class);

    /**
     * Find By
     */
    @FindBy(css = ".footer.mouv")
    private WebElement footer;

    @FindBy(css = "ul.footer-links.footer > li:nth-child(7) > a")
    private WebElement linkToVoiceAssistants;

    @FindBy(css = ".copyright")
    private WebElement copyright;

    @FindBy(css = "ul.footer-links.footer > li:nth-child(8) > a")
    private WebElement linkToProgramSchedule;

    public void navigateToEnv() {
        get(config.getEnvironment());
    }

    public void scrollToFooter() {
        scrollToElement(footer);
    }

    public boolean copyrightUpdated() {
        String actualCopyrightYear = this.copyright.getText().replaceAll("[^0-9]", "");
        saveScreenShotPNG();
        return actualCopyrightYear.equals(Calendar.getInstance().get(Calendar.YEAR)+"");
    }

    public void goToVoiceAssistants() {
        clickOn(linkToVoiceAssistants);
    }

    public void goToProgramSchedule() {
        clickOn(linkToProgramSchedule);
    }

}
