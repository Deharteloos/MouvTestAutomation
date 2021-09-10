package steps;

import context.ScenarioContext;
import enums.Context;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MouvInfoArticlePage;

import static org.testng.Assert.assertTrue;

public class MouvInfoArticlePageSteps {

    /**
     * Page objects declarations
     */
    private ScenarioContext context;
    private MouvInfoArticlePage mouvInfoArticlePage;

    public MouvInfoArticlePageSteps(ScenarioContext context, MouvInfoArticlePage mouvInfoArticlePage) {
        this.context = context;
        this.mouvInfoArticlePage = mouvInfoArticlePage;
    }

    /**
     * Steps definitions
     */
    @When("Scroll down and click on \"bourse Lena Situations\"")
    public void scrollDownAndClickOnBourseLenaSituations() {
        context.set(Context.LENA_SITUATIONS_SCHOLARSHIP, mouvInfoArticlePage.goToScholarship());
    }

    @Then("The page we are looking is not found")
    public void thePageWeAreLookingIsNotFound() {
        assertTrue(mouvInfoArticlePage.isTheScholarshipPageAvailable(context.get(Context.LENA_SITUATIONS_SCHOLARSHIP)));
    }
}
