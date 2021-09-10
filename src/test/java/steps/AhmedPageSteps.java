package steps;

import context.ScenarioContext;
import io.cucumber.java.en.Then;
import pageObjects.AhmedPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AhmedPageSteps {

    /**
     * Page objects declarations
     */
    private ScenarioContext context;
    private AhmedPage ahmedPage;

    public AhmedPageSteps(ScenarioContext context, AhmedPage ahmedPage) {
        this.context = context;
        this.ahmedPage = ahmedPage;
    }

    /**
     * Steps defintions
     */
    @Then("No content in the section \"Dernières News\"")
    public void noContentInTheSection() {
        assertFalse(ahmedPage.isLatestNewsSectionEmpty(), "The section \"Dernières News\" is empty");
    }

}
