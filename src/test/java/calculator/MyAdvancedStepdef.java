package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAdvancedStepdef {
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Given("^Two int input values, (\\d+) and (\\d+)$")
    public void twoIntInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }
    @When("^I get sqrt of dividing the two values$")
    public void iGetSqrtOfDividingTheTwoValues() {
        result = calculator.sqrtOfDividing(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the double result (\\d+)$")
    public void iExpectTheDoubleResult(int arg0) {
        Assert.assertEquals(arg0, result, 0.1);
    }
}
