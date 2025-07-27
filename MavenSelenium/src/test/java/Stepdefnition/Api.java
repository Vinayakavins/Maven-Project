package Stepdefnition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Api {
	
	@Given("I Set POST employee service api endpoint")
	public void i_set_post_employee_service_api_endpoint() {
		 System.out.println("Inside step - Set POST employee service api endpoint ");
	}

	@When("I Set request HEADER")
	public void i_set_request_header() {
		 System.out.println("Inside step - Set request HEADER ");
	}

	@When("Send a POST HTTP request")
	public void send_a_post_http_request() {
		System.out.println("Inside step - Send a POST HTTP request ");
	}

	@Then("I receive valid Response")
	public void i_receive_valid_response() {
		System.out.println("Inside step - I receive valid Response ");
	}

	@Given("I Set PUT employee service api endpoint")
	public void i_set_put_employee_service_api_endpoint() {
		System.out.println("Inside step - I Set PUT employee service api endpoint ");
	}

	@When("I Set Update request Body")
	public void i_set_update_request_body() {
		System.out.println("Inside step - I Set Update request Body ");
	}

	@When("Send PUT HTTP request")
	public void send_put_http_request() {
		System.out.println("Inside step - Send PUT HTTP request ");
	}

	@Then("I receive valid HTTP response code {int}")
	public void i_receive_valid_http_response_code(Integer int1) {
		System.out.println("Inside step - I receive valid HTTP response code {int} "); 
	}

	@Given("I Set GET employee service api endpoint When I Set request HEADER")
	public void i_set_get_employee_service_api_endpoint_when_i_set_request_header() {
		System.out.println("Inside step - I Set GET employee service api endpoint When I Set request HEADER ");
	}

	@Given("Send GET HTTP request")
	public void send_get_http_request() {
		System.out.println("Inside step - Send GET HTTP request ");
	}

	@Given("I Set DELETE employee service api endpoint When I Send DELETE HTTP request")
	public void i_set_delete_employee_service_api_endpoint_when_i_send_delete_http_request() {
		System.out.println("Inside step - I Set DELETE employee service api endpoint When I Send DELETE HTTP request ");
	}


}
