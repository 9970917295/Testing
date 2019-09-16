package Globaltest;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class StepDefinitions {
	
	@Given("^Open login Page$")
	public void open_login_Page() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@Given("^Enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@When("^clicked on login button$")
	public void clicked_on_login_button() throws Throwable {
		Assert.assertTrue(true);
	   
	}

	@Then("^should open Homepage$")
	public void should_open_Homepage() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@Given("^Set API endpoint$")
	public void set_API_endpoint() throws Throwable {
		Assert.assertTrue(true);
	   
	}

	@When("^run GET request$")
	public void run_GET_request() throws Throwable {
		Assert.assertTrue(true);
	   
	}

	@Then("^should get valid HTTP respone$")
	public void should_get_valid_HTTP_respone() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@Given("^open login page$")
	public void open_login_page() throws Throwable {
		Assert.assertTrue(true);
	   
	}

	@Given("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@When("^click on login$")
	public void click_on_login() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@Then("^should open HomePage$")
	public void should_open_HomePage() throws Throwable {
		Assert.assertTrue(false);
	    
	}

	@Then("^should open HomePage of UST$")
	public void should_open_HomePage_of_UST() throws Throwable {
		Assert.assertTrue(false);
	   
	}
	@Given("^open Admin_deatils Page$")
	public void open_Admin_deatils_Page() throws Throwable {
		Assert.assertTrue(false);
	   
	}

	@When("^click on Admin_Info button$")
	public void click_on_Admin_Info_button() throws Throwable {
		Assert.assertTrue(false);
	}

	@Then("^should redirect to Admin Info page$")
	public void should_redirect_to_Admin_Info_page() throws Throwable {
		Assert.assertTrue(false);
	  
	}

	@Given("^open Finance_deatils Page$")
	public void open_Finance_deatils_Page() throws Throwable {
		Assert.assertTrue(false);
	 
	}

	@When("^click on Finance_Info button$")
	public void click_on_Finance_Info_button() throws Throwable {
		Assert.assertTrue(true);
	  
	}

	@Then("^should redirect to Finance Info page$")
	public void should_redirect_to_Finance_Info_page() throws Throwable {
		Assert.assertTrue(true);
	}

	@Given("^open Client_deatils Page$")
	public void open_Client_deatils_Page() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@When("^click on client_Info button$")
	public void click_on_client_Info_button() throws Throwable {
		Assert.assertTrue(true);
	   
	}

	@Then("^should redirect to client Info page$")
	public void should_redirect_to_client_Info_page() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@Given("^open company_deatils Page$")
	public void open_company_deatils_Page() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@When("^click on company_Info button$")
	public void click_on_company_Info_button() throws Throwable {
		Assert.assertTrue(true);
	  
	}

	@Then("^should redirect to company Info page$")
	public void should_redirect_to_company_Info_page() throws Throwable {
		Assert.assertTrue(true);
	  
	}

	@Given("^open customer_deatils Page$")
	public void open_customer_deatils_Page() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@When("^click on customer_Info button$")
	public void click_on_customer_Info_button() throws Throwable {
		Assert.assertTrue(true);
	    
	}

	@Then("^should redirect to customer Info page$")
	public void should_redirect_to_customer_Info_page() throws Throwable {
		Assert.assertTrue(true);
	   
	}

	@Given("^open emp_deatils Page$")
	public void open_emp_deatils_Page() throws Throwable {
		throw new SkipException("skipped");
	   	}

	@When("^click on emp_Info button$")
	public void click_on_emp_Info_button() throws Throwable {
		throw new SkipException("skipped");
	 
	}

	@Then("^should redirect to emp Info page$")
	public void should_redirect_to_emp_Info_page() throws Throwable {
		
		throw new SkipException("skipped");
	   
	}
	

}
