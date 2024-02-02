package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on live casino")
    public void iClickOnJoinNowLinkText() {
        new HomePage().captchaAcceptCookies();
        new HomePage().captchaAcceptCookies2();

        new HomePage().clickOnLiveCasino();
    }

    @Then("I verify text - Try Live Casino - Live Action Dealers & Selection of Games")
    public void iVerifyTextTryLiveCasinoLiveActionDealersSelectionOfGames() {
        Assert.assertEquals(new HomePage().verifyTextLiveCasino(), "Try Live Casino - Live Action Dealers & Selection of Games");
    }
}
