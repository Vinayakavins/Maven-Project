package Stepdefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Featu {

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		 System.out.println("Inside step - User is on Home Page ");
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		System.out.println("Inside step - User Navigate to LogIn Page ");
	}

	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		System.out.println("Inside step - User enters UserName and Password ");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("Inside step - Message displayed Login Successfully ");
	}

	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() {
		System.out.println("Inside step - User LogOut from the Application ");
	}

	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		System.out.println("Inside step - Message displayed LogOut Successfully");
	}

}
