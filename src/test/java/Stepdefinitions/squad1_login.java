package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class squad1_login {
//	static String url = "https://itest.squad1.tech//login";
//	WebDriver driver;
	
	
	
	@Given("User navigates to Squad1 login page")
	public void user_navigates_to_squad1_login_page() {
		// Write code here that turns the phrase above into concrete actions

//		try {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek\\Desktop\\Jmeter\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get(url);
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
System.out.println("User navigates to Squad1 login page");
	}

	@When("^User enters email (.+)$")
	public void user_enters_email(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@placeholder=\"Email ID\"]")).sendKeys(string);
//		Thread.sleep(1000);
		System.out.println("User navigates to Squad1 login page"+string);
	}

	@And("^User enters password (.+)$")
	public void user_enters_password(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(string);
//		Thread.sleep(1000);
		System.out.println("user enters password"+string);
	}

	@And("User click on login button")
	public void user_click_on_login_button() throws Exception {
		// Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("loginBtn")).click();
//		Thread.sleep(10000);
		System.out.println("User click on login button");
	}

	@Then("USer logged in sucessfully")
	public void u_ser_logged_in_sucessfully() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user logged in successfully");
	}
	@When("User enters invalid email {string}")
	public void user_enters_invalid_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("User enters invalid email ");
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User enters invalid password ");
	}

	@Then("USer logged in unsucessfully")
	public void u_ser_logged_in_unsucessfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("USer logged in unsucessfully");
	}

	@When("User keep email as blank {string}")
	public void user_keep_email_as_blank(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User keep email as blank");
	}

	@When("User keep password as blank {string}")
	public void user_keep_password_as_blank(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User keep password as blank");
	}

	@Then("USer got error message")
	public void u_ser_got_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("USer got error message");
	}
}
