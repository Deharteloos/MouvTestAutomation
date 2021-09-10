package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProgramsPage extends Page {

    private static final Logger LOG = LogManager.getLogger(ProgramsPage.class);

    /**
     * Find By
     */
    @FindBy(css = ".podcast-panel-button")
    private List<WebElement> podcastPanelButtons;

    @FindBy(css = ".podcast-panel-box")
    private List<WebElement> podcastPanelBoxes;

    @FindBy(css = ".program-grid-page")
    private WebElement programGrid;

    public void clickOnPanelButton(int number) {
        shortWait.until(visibilityOf(programGrid));
        if(podcastPanelButtons.size() < 2) {
            LOG.warn("Bug not reproducible. There are less than 2 programs with a podcast panel button.");
            return;
        }
        WebElement podcastPanelButton = podcastPanelButtons.get(number-1);
        scrollToElement(podcastPanelButton);
        clickOn(podcastPanelButton);
    }

    public boolean isPodcastPanelBoxVisible(int number) {
        return podcastPanelBoxes.get(number-1).getAttribute("class").contains("visible");
    }

    public void scrollToPrograms(int programOne, int programTwo) {
        scrollToElement(podcastPanelBoxes.get(programOne-1));
        saveScreenShotPNG();
        scrollToElement(podcastPanelBoxes.get(programTwo-1));
        saveScreenShotPNG();
    }

}
