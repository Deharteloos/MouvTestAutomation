package steps;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DressCodeStreetArticlePage;

import static org.testng.Assert.assertTrue;

public class DressCodeStreetArticlePageSteps {

    /**
     * Page objects declarations
     */
    private ScenarioContext context;
    private DressCodeStreetArticlePage dressCodeStreetArticlePage;

    public DressCodeStreetArticlePageSteps(ScenarioContext context, DressCodeStreetArticlePage dressCodeStreetArticlePage) {
        this.context = context;
        this.dressCodeStreetArticlePage = dressCodeStreetArticlePage;
    }

    /**
     * Steps definitions
     */
    @When("Scroll down and click on the instagram link")
    public void scrollDownAndClickOnTheInstagramLink() {
        dressCodeStreetArticlePage.clickOnSocialLink();
    }

    @When("Scroll down and click on the youtube link")
    public void scrollDownAndClickOnTheYoutubeLink() {
        dressCodeStreetArticlePage.clickOnSocialLink();
    }


    @Then("A white page is displayed mentioning a blocking at the level of the url")
    public void aWhitePageIsDisplayedMentioningABlockingAtTheLevelOfTheUrl() {
        assertTrue(dressCodeStreetArticlePage.isSocialLinkWorking(), "The link is not working. A blank page is shown.");
    }
}
