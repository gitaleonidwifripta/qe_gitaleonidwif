package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.Produk.DeleteProdukP;
import starter.fakestoreapi.Produk.GetAllProdukP;
import starter.fakestoreapi.Produk.PutProdukP;

public class ProdukSteps {
    @Steps
    GetAllProdukP getallprodukp;
    @Steps
    PutProdukP putprodukp;
    @Steps
    DeleteProdukP deleteprodukp;

    @Given("I set GET endpoints")
    public void iSetGETEndpoints() {
        getallprodukp.GetApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        getallprodukp.GetHttpRequest();
    }
    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getallprodukp.validateHttpResponseCode200();
    }
    @And("I received valid data for all products")
    public void iReceivedValidDataForAllProducts() {
        getallprodukp.validateDataDetailproduct();
    }


    @Given("I set PUT endpoints")
    public void iSetPUTEndpoints() {
        putprodukp.iSetPUTEndpoints();
    }

    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        putprodukp.iSendPUTHTTPRequest();
    }

    @Then("I received a valid HTTP response code {int} on the product's PUT")
    public void iReceivedAValidHTTPResponseCodeOnTheProductSPUT() {
        putprodukp.iReceivedAValidHTTPResponseCodeOnTheProductSPUT();
    }

    @And("I received valid data for the product")
    public void iReceivedValidDataForTheProduct() {
        putprodukp.iReceivedValidDataForTheProduct();
    }


    @Given("I set DELETE endpoints")
    public void iSetDELETEEndpoints() {
        deleteprodukp.iSetDELETEEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        deleteprodukp.iSendDELETEHTTPRequest();
    }

    @Then("I received a valid HTTP response code {int} on a product DELETE")
    public void iReceivedAValidHTTPResponseCodeOnAProductDELETE(int arg0) {
        deleteprodukp.iReceivedAValidHTTPResponseCodeOnAProductDELETE();
    }
}
