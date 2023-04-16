package starter.fakestoreapi.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUsersP {
    protected static String url = "https://fakestoreapi.com/users";

    @Step("I set the GET api endpoint for the user")
    public String iSetTheGETApiEndpointForTheUser(){
        return url + "users";
    }
    @Step("I am sending HTTP Api GET requests for users")
    public void iAmSendingHTTPApiGETRequestsForUsers(){
        SerenityRest.given()
                .when()
                .get(iSetTheGETApiEndpointForTheUser());
    }
    @Step("I received a valid HTTP response code 200 for Get All data users")
    public void iReceivedAValidHTTPResponseCodeForGetAllDataUsers(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for all users")
    public void iReceivedValidDataForAllUsers(){
    }
}
