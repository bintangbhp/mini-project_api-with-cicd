package starter.stepdefinitions.Products_Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.user.Products.GetAllProducts;
import starter.user.Products.GetProductRating;
import starter.user.Misc;

public class GetProductRating_Steps {
    @Steps
    GetProductRating getProductRating;

    @Given("I set the API Endpoint to get product rating")
    public void setAPIEndpointGetProductRating(){
        getProductRating.setAPIEndpointGetRating();
    }

    @When("I send the request to get product rating")
    public void sendRequestGetProductRating(){
        getProductRating.sendRequestGetRatingProduct();
    }

    @And("I get status code 200 after request to get product rating")
    public void getStatus200(){
        getProductRating.getStatus200();
    }

    @Then("I receive all product rating")
    public void receiveProductRating(){
        getProductRating.receiveAllDataProducts();
    }
}
