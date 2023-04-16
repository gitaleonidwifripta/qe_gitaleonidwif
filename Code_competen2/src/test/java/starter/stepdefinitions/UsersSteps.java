package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.users.GetAllUsersP;

public class UsersSteps {

    @Steps
    GetAllUsersP getallusersp;
    @Given("I set the GET api endpoint for the user")
    public void iSetTheGETApiEndpointForTheUser() {
        getallusersp.iSetTheGETApiEndpointForTheUser();
    }

    @When("I am sending HTTP Api GET requests for users")
    public void iAmSendingHTTPApiGETRequestsForUsers() {
        getallusersp.iAmSendingHTTPApiGETRequestsForUsers();
    }

    @Then("I received a valid HTTP response code {int} for Get All data users")
    public void iReceivedAValidHTTPResponseCodeForGetAllDataUsers(int arg0) {
        getallusersp.iReceivedAValidHTTPResponseCodeForGetAllDataUsers();
    }

    @And("I received valid data for all users")
    public void iReceivedValidDataForAllUsers() {
        getallusersp.iReceivedValidDataForAllUsers();
    }
}
