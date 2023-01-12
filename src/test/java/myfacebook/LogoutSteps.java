package myfacebook;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	@When("user logs out from application")
	public void user_logs_out_from_application() {
	    System.out.println("user logs out from application");
	}

	@Then("Message displayed Logout successfully")
	public void message_displayed_logout_successfully() {
		System.out.println("Message displayed Logout successfully");
	}

	@Then("Browser quit by driver")
	public void browser_quit_by_driver() {
		System.out.println("Browser quit by driver");
	}
}
