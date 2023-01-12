package myfacebook;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutSteps {
	
	//PicoContainer
	public CheckOutSteps(Production ig){ // This is what is called dependency injection using composition 
		f = ig; // By including the object of that class...
	}
	
	public int am;
	public Production f;
	@Given("I should have {int} NIS")
	public void i_should_have_nis(Integer int1) {
		am = int1;
	}

	@When("I choose {int} apple")
	public void i_choose_apple(Integer int1) {
		f.checkout();
	}

	@Then("I should have {int}")
	public void i_should_have(Integer int1) {
		assertTrue(am == 2);
	}
}
