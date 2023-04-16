package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.cart.GetCartP;

public class CartSteps {
    @Steps
    GetCartP getcartp;
    @Given("I set the GET api endpoint")
    public void iSetTheGETApiEndpoint() {
        getcartp.iSetTheGETApiEndpoint();
    }

    @When("I am sending HTTP Api GET request")
    public void iAmSendingHTTPApiGETRequest() {
        getcartp.iAmSendingHTTPApiGETRequest();
    }

    @Then("I received a valid HTTP response code {int} for Get All data Cart")
    public void iReceivedAValidHTTPResponseCodeForGetAllDataCart(int arg0) {
        getcartp.iReceivedAValidHTTPResponseCodeForGetAllDataCart();
    }

    @And("I received valid data for all carts")
    public void iReceivedValidDataForAllCarts() {
        getcartp.iReceivedValidDataForAllCarts();
    }
}
