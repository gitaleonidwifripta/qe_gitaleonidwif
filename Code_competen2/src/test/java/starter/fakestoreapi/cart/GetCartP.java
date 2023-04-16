package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCartP {
    protected static String url = "https://fakestoreapi.com/carts";

    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "carts";
    }
    @Step("I am sending HTTP Api GET request")
    public void iAmSendingHTTPApiGETRequest(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpoint());
    }
    @Step("I received a valid HTTP response code 200 for Get All data Cart")
    public void iReceivedAValidHTTPResponseCodeForGetAllDataCart(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for all carts")
    public void iReceivedValidDataForAllCarts(){
    }
}
