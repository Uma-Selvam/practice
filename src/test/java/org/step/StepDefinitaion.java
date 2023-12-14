package org.step;
import org.Base.BaseClass;

import io.cucumber.java.en.*;
import io.restassured.response.Response;


public class StepDefinitaion extends BaseClass {
	
	Response response;
	
	@Given("User Create the request object")
	public void user_create_the_request_object() {
	    
		requestObject("https://reqres.in/");
	   
	}
	@When("User adds the querey parameters")
	public void user_adds_the_querey_parameters() {
	    addQueryParameter("page","2");
	   
	}
	@When("User creates the response object")
	public void user_creates_the_response_object() {
		response = responseObject("GET","api/users");
	   
	}
	@Then("User validates the response code and response body")
	public void user_validates_the_response_code_and_response_body() {
		verifyResponseCode(response, 200);
		verifyResponseBody(response,"data[0].last_name","Lawson");
	    
	   
	}


}
		

