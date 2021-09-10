package steps;

import context.ScenarioContext;
import enums.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.VoiceAssistanPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class VoiceAssistantPageSteps {

    /**
     * Page objects declarations
     */
    private ScenarioContext context;
    private VoiceAssistanPage voiceAssistanPage;

    public VoiceAssistantPageSteps(ScenarioContext context, VoiceAssistanPage voiceAssistanPage) {
        this.context = context;
        this.voiceAssistanPage =  voiceAssistanPage;
    }

    /**
     * Steps definitions
     */
    @And("Scroll down and click on \"Skill Mouv'\"")
    public void scrollDownAndClickOnSkillMouv() {
        context.set(Context.SKILL_MOUV_URL, voiceAssistanPage.clickOnSkillMouv());
    }

    @Then("The page is not found")
    public void thePageIsNotFound() {
        assertTrue(voiceAssistanPage.pageFound(context.get(Context.SKILL_MOUV_URL)), "Page not found");
    }

}
