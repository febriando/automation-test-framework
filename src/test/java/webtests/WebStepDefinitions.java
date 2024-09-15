package webtests;

import io.cucumber.java.en.*;

public class WebStepDefinitions {
    @Given("homepage")
    public void iAmOnTheHomepage() {
        // homepage web ui
        System.out.println("navigare homepage");
    }

    @When("click {string}")
    public void iClickOn(String category) {
        // click in web ui
        System.out.println("condition click");
    }

    @Then("List of phones")
    public void iShouldSeeAListOfPhones() {
        // list of phones
        System.out.println("show the list of phone");
    }
}
