package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.sepulsa.com/");
        login.validateOnTheLoginPage();
    }
    @When("I clicked the enter button")
    public void doClickMasukButton(){login.clickMasukLogin();}
    @And("I enter valid Email")
    public void doEnterValidEmail(){login.inputEmail("gitaleoni04@gmail.com");}
    @And("I enter valid Password")
    public void doEnterValidPassword(){
        login.inputPassword("gitaleonidwi2001");
    }
    @And("I clicked the enter login")
    public void doClickLoginButton(){login.clickButtonLogin();}
    @Then("i am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }
    @And("I enter invalid Email")
    public void doEnterInValidEmail(){login.inputEmail("gitadwi@gmail.com");}
    @And("I enter invalid Password")
    public void doEnterInValidPassword(){ login.inputPassword("gitaleoni");
    }
    @Then("I can see error message {string}")
    public void doSeeErrorMessage(String message){
        login.validateErrorMessageDisplayed();
        login.validateEqualErrorMessage(message);
    }


}











