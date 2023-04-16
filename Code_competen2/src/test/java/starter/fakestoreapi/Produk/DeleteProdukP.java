package starter.fakestoreapi.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProdukP {
    protected String url = "https://fakestoreapi.com/products/6";
    @Step("I set DELETE endpoints")
    public String iSetDELETEEndpoints(){
        return url + "products/6";
    }

    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest(){
        SerenityRest.given().delete(iSetDELETEEndpoints());
    }
    @Step("I received a valid HTTP response code 200 on a product DELETE")
    public void iReceivedAValidHTTPResponseCodeOnAProductDELETE(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
