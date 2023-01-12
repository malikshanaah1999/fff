package myfacebook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("The Administrator is on the login page.")
	public void the_administrator_is_on_the_login_page() {
	    System.out.println("The Administrator is on the login page");
	}

	@When("The Admin. enters a valid username and password.")
	public void the_admin_enters_a_valid_username_and_password() {
		System.out.println("The Admin. enters a valid username and password");
	}

	@When("Clicks on the login button.")
	public void clicks_on_the_login_button() {
		System.out.println("Clicks on the login button");
	}

	@Then("The user should be navigated to the Home page.")
	public void the_user_should_be_navigated_to_the_home_page() {
		System.out.println("The user should be navigated to the Home page");
	}

	@When("The Admin. entered a wrong username or password.")
	public void the_admin_entered_a_wrong_username_or_password() {
		System.out.println("The Admin. entered a wrong username or password");
	}

	@Then("The Administrator will still on the login page.")
	public void the_administrator_will_still_on_the_login_page() {
		System.out.println("The Administrator will still on the login page");
	}
}
/*
 
 *Feature: Login

  I want to login on Keepfy

  Background:
    Given I go to '/login'
    And the field 'email' is empty
    And the field 'password' is empty

  Scenario: Error on empty fields
    When I click on 'enter'
    Then field 'email' should be with error
    And field 'password' should be with error

  Scenario: Wrong password
    When I type 'john.test@keepfy.com' in 'email'
    And I type '123456' in 'password'
    And I click on 'enter'
    Then I should see 'E-mail or password is incorrect'

  Scenario: Login successfully
    Given I have users:
      | name           | email             | password |
      | Vitor Batista  | vitor@keepfy.com  | abcdef   |
    When I type 'vitor@keepfy.com' in 'email'
    And I type 'abcdef' in 'password'
    And I click on 'enter'
    Then I shouldn't see 'Access your account'
@malikshanaah1999
 
 */
