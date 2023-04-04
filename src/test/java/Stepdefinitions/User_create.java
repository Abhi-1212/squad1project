package Stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class User_create {

	@Given("User navigates to user create page")
	public void User_navigates_to_user_create_page() {
		 System.out.println("User navigates to user");
	}
	@When("User enter firstname {string}")
	public void User_enter_firstname(String string) {
		 System.out.println("User enter firstname "+string);
		
	}
		
	@And("User enter Lastname {string}")
	public void User_enter_Lastname(String string) {
		 System.out.println("User enter Lastname "+string);
	}
	
	@And("User select gender as {string}")
	public void User_select_gender_as(String string) {
		 System.out.println("User select gender as "+string);
	}
	@And("User Click login button")
	public void user_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User Click login button");
	}

	@Then("User created successfully")
	public void user_created_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User created successfully");
	}

}
