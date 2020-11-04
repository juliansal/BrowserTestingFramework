package org.happykraken.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.happykraken.resources.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StepsGeneral extends Base {

    @Given("I go to {string}")
    public void i_go_to(String url) {
        System.out.println(url);
        driver.navigate().to("http://www." + url);
        wait.until(ExpectedConditions.urlContains(url));
    }

    @Then("I wait {int} seconds")
    public void i_wait_seconds(int secs) {
        waitSeconds(secs);
    }
}
