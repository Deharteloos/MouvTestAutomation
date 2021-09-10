package steps;

import context.ScenarioContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramsPage;

import static org.testng.Assert.assertFalse;

public class ProgramsPageSteps {

    /**
     * Page objects declaration
     */
    private ScenarioContext context;
    private ProgramsPage programsPage;

    public ProgramsPageSteps(ScenarioContext context, ProgramsPage programsPage) {
        this.context = context;
        this.programsPage = programsPage;
    }

    /**
     * Steps definitions
     */
    @When("Click on the antenna symbol of one program")
    public void clickOnTheAntennaSymbolOfOneProgram() {
        programsPage.clickOnPanelButton(1);
    }

    @And("Click on the antenna symbol of another program")
    public void clickOnTheAntennaSymbolOfAnotherProgram() {
        programsPage.clickOnPanelButton(2);
    }

    @Then("The drop-down menu for the first program should disappear")
    public void theDropDownMenuForTheFirstProgramShouldDisappear() {
        programsPage.scrollToPrograms(1, 2);
        assertFalse(programsPage.isPodcastPanelBoxVisible(1), "The dropdown menu for the first program is still open");
    }

}
