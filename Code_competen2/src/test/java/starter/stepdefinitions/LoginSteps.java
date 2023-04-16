package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.login.PostLoginP;

public class LoginSteps {
    @Steps
    PostLoginP postLoginP;
    @Given("I set POST endpoints")
    public void iSetPOSTEndpoints() {
        postLoginP.PostEndpointLogin();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        postLoginP.PostHttpRequestLogin();
    }

    @And("I receive valid HTTP response code Login 201")
    public void iReceiveValidHTTPResponseCodeLogin201() {
        postLoginP.iReceiveValidHTTPResponseCodeLogin201();
    }

    @Then("I received the correct data")
    public void iReceivedTheCorrectData() {
        postLoginP.receivedCorrectDataLogin();
    }
}
