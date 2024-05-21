package starter.user.Products;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRating {
    public static String url = "https://altashop-api.fly.dev/api/products/1/ratings";

    @Step("I set the API Endpoint to get product rating")
    public String setAPIEndpointGetRating(){
        return url;
    }

    @Step("I send the request to get product rating")
    public void sendRequestGetRatingProduct(){
        SerenityRest.given()
                .get(setAPIEndpointGetRating());
    }

    @Step("I get status code 200 after request to get product rating")
    public void getStatus200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive all product rating")
    public void receiveAllDataProducts(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.RATING_SCHEME);

        restAssuredThat(response -> response.body("data", Matchers.notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
