package org.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class String_Utility_Steps {


    private String result;

    @Given("String_Utility_reverse is available")
    public void i_have_a_string() {

    }

    @When("I reverse {string} -> cBa")
    public void i_reverse_the_string(String inputString) {
        result = String_Utility.reverseString(inputString);
    }

    @Then("the result is reversed should be {string}")
    public void the_result_should_be_reverse(String expected) {
        assertEquals(expected, result);


    }


    @Given("String_Utility_capitalize is available")
    public void i_have_a_capitalized_string() {

    }

    @When("I Capitalize {string} -> ABC")
    public void i_capitalize_the_string(String inputString) {
        result = String_Utility.capitalizeString(inputString);
    }

    @Then("the result is capitalized should be {string}")
    public void the_result_should_be_capitalize(String expected) {
        assertEquals(expected, result);
    }


    @Given("String_Utility_lowercase is available")
    public void i_have_a_lowercase_string() {

    }

    @When("I Lowercase {string} -> abc")
    public void i_lowercase_the_string(String inputString) {
        result = String_Utility.lowercaseString(inputString);
    }

    @Then("the result is lowercase should be {string}")
    public void the_result_should_be_lowercase(String expected) {
        assertEquals(expected, result);
    }
}


