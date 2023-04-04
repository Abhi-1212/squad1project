package Stepdefinitions;

import io.cucumber.java.en.*;

public class gmail {
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User navigates to login page");
	}

	@When("User enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user enters username");

	}

	@When("User enter password {string}")
	public void user_enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user enters pass");
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("userclick");
	}

	@Then("user logged in successfully.")
	public void user_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user logged in");
	}

	
	
	
	
	 @Given("^User go to login page$")
	    public void user_go_to_login_page() throws Throwable {
	      System.out.println("User go to login page");
	    }

	    @When("^user enters user (.+)$")
	    public void user_enters_user(String email) throws Throwable {
	    	System.out.println("user enters user"+email);
	        
	    }

	   

	    @And("^user enters passw (.+)$")
	    public void user_enters_passw(String passwo) throws Throwable {
	    	System.out.println("user enters user"+passwo);
	    }

	    @And("^User clicks on login$")
	    public void user_clicks_on_login() throws Throwable {
	    	System.out.println("user clicked");
	    }

	
	
	    @Then("Users  successful")
	    public void users_successful() throws Throwable {
	       System.out.println("success");
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
