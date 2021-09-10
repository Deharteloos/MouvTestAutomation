package steps;

import context.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.AnimatorsPage;

public class AnimatorsPageSteps {

    /**
     * Page objects declaration
     */
    private ScenarioContext context;
    private AnimatorsPage animatorsPage;

    public AnimatorsPageSteps(ScenarioContext context, AnimatorsPage animatorsPage) {
        this.context = context;
        this.animatorsPage = animatorsPage;
    }

    /**
     * Static selectors
     */
    private static final By cookiesDialogBoxCssSelector = By.cssSelector("#didomi-popup > div");
    private static final By cookiesAcceptBtnCssSelector = By.cssSelector("#didomi-notice-agree-button");

    /**
     * Steps definitions
     */
    @Given("Go to the page {string}")
    public void goToThePage(String link) {
        animatorsPage.navigateTo(link);
        animatorsPage.acceptsCookies(cookiesDialogBoxCssSelector, cookiesAcceptBtnCssSelector);
    }

    @When("Click on \"Ahmed\"")
    public void clickOnAhmed() {
        animatorsPage.clickOnAhmed();
    }

}
