package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Form1;
import tasks.InserFullaNmae;
import tasks.OpenUp;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class utestStepDefinitions {

     @Managed
     WebDriver driver;

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that christian entered the page of utes$")
    public void thatChristianEnteredThePageOfUtes() {
        OnStage.theActorCalled("Cristian").wasAbleTo(OpenUp.thePage());

    }


    @Given("^clicked join button today$")
    public void clickedJoinButtonToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(Form1.fill());
    }


    @When("^he fill the First Name with \"([^\"]*)\"$")
    public void he_fill_the_First_Name_with(String arg1) {
        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        OnStage.theActorInTheSpotlight().attemptsTo(InserFullaNmae.the(arg1));
    }

    @Then("^he has a new user$")
    public void heHasANewUser() {

    }
}
