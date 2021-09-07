package steps;

import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.HomePage;

import static org.testng.Assert.assertTrue;

public class HomePageSteps {

    /**
     * Page objects declarations
     */
    private ScenarioContext context;
    private HomePage homePage;

    public HomePageSteps(ScenarioContext context, HomePage homePage) {
        this.context = context;
        this.homePage = homePage;
    }

    /**
     * Static selectors
     */
    private static final By cookiesDialogBoxCssSelector = By.cssSelector("#didomi-popup > div");
    private static final By cookiesAcceptBtnCssSelector = By.cssSelector("#didomi-notice-agree-button");

    /**
     * Steps definitions
     */
    @Given("Go to the homepage")
    public void goToTheHomepage() {
        homePage.navigateToEnv();
        homePage.acceptsCookies(cookiesDialogBoxCssSelector, cookiesAcceptBtnCssSelector);
    }

    @When("Scroll down to the footer")
    public void scrollDownToTheFooter() {
        homePage.scrollToFooter();
    }

    @Then("The copyright should be updated to the current year")
    public void theCopyrightShouldBeUpdatedToTheCurrentYear() {
        assertTrue(homePage.copyrightUpdated(), "The copyright on the website has not being updated");
    }

    @When("Scroll down to the footer and click on \"Grille des programmes\"")
    public void scrollDownToTheFooterAndClickOnProgramSchedule() {
        homePage.scrollToFooter();
        homePage.goToProgramSchedule();
    }

    @When("Scroll down to the footer and click on \"Assistants vocaux\"")
    public void scrollDownToTheFooterAndClickOnVoiceAssistants() {
        homePage.scrollToFooter();
        homePage.goToVoiceAssistants();
    }
}
