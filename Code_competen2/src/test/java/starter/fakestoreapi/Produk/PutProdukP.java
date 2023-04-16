package starter.fakestoreapi.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutProdukP {
    protected String url = "https://fakestoreapi.com/products/7";

    @Step("I set PUT endpoints")
    public String iSetPUTEndpoints(){
        return url + "products/7";
    }

    @Step("I send PUT HTTP request")
    public void iSendPUTHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "originote");
        requestBody.put("price", 100.000);
        requestBody.put("description", "skincare");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "skincaree");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPUTEndpoints());
    }
    @Step("I received a valid HTTP response code 200 on the product's PUT")
    public void iReceivedAValidHTTPResponseCodeOnTheProductSPUT(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for the product")
    public void iReceivedValidDataForTheProduct(){
        restAssuredThat(response -> response.body("'title'", equalTo("originote")));
        restAssuredThat(response -> response.body("'price'", equalTo(100.000)));
        restAssuredThat(response -> response.body("'description'", equalTo("skincare")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("'category'", equalTo("skincaree")));
    }
}
