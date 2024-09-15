package apitests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.cucumber.java.en.*;

public class ApiStepDefinitions {
    private Response response;

    @Given("valid user ID")
    public void iHaveAValidUserID() {
        // valid user ID
        System.out.println("check valid user ID");
    }

    @When("GET request to the API")
    public void iMakeAGetRequestToTheApi() {
        response = RestAssured.get("https://dummyapi.io/data/v1/user/{userId}");
    }

    @Then("receive 200 response code")
    public void iShouldReceiveA200ResponseCode() {
        response.then().statusCode(200);
    }
}
