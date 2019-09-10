package Globaltest;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class StepDefinitions {
	
	@Given("^Open login Page$")
	public void open_login_Page() throws Throwable {
	   
	  
	}

	@Given("^Enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
	   
	    
	}

	@When("^clicked on login button$")
	public void clicked_on_login_button() throws Throwable {
	   
	  
	}

	@Then("^should open Homepage$")
	public void should_open_Homepage() throws Throwable {
		Assert.assertTrue(true);
	   
	}
	@Given("^Set API endpoint$")
	public void set_API_endpoint() throws Throwable {
	   
	}
	@When("^run GET request$")
	public void run_GET_request() throws Throwable {
	   
	}

	@Then("^should get valid HTTP respone$")
	public void should_get_valid_HTTP_respone() throws Throwable {
		Assert.assertTrue(false);
	    
	}

	@Given("^open login page$")
	public void open_login_page() throws Throwable {
	   
	}

	@Given("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
	  
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable {
	}
	
	  

	@Then("^should open HomePage$")
	public void should_open_HomePage() throws Throwable {
	    Assert.assertTrue(false);
	}

	

}
