package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDef {
	
	@Given("^Validate the Browser$")
    public void validate_the_browser() throws Throwable {
		System.out.println("Browser Validated.");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered.");
    }

    @Then("^Check if browser is displayed$")
    public void check_if_browser_is_displayed() {
    	System.out.println("Browser is displayed.");
    }
    
	@Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable{
		//Selenium Code to automatically navigate to landing page
		System.out.println("Navigated to Login Url.");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) {
    	//Selenium Code to automatically enter user name and password
    	System.out.println(strArg1 + " Logged in Succesfully");
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) {
        List<List<String>> obj = data.asLists();
        System.out.print("Name: " + obj.get(0).get(0));
        System.out.println(" " + obj.get(0).get(1));
        System.out.println("Email: " + obj.get(0).get(2));
        System.out.println("Location: " + obj.get(0).get(3));
        System.out.println("Contact No.: " + obj.get(0).get(4));
    }

    @When("^Users login into application with username (.+) and password (.+)$")
    public void users_login_into_application_with_username_and_password(String username, String password) {
    	System.out.println(username + " Logged in Succesfully");
    }
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() {
    	//Selenium Code to automatically populate home page
    	System.out.println("On Home page");
    }
    
    /*
    @And("^Cards displayed: \"([^\"]*)\"$")
    public void cards_displayed_something(String strArg1) {
    }
    */
    
    @And("Cards displayed: {string}")
    public void cards_displayed(String string) {
    	if(string.equals("true"))
    		//Selenium Code to automatically display cards
    		System.out.println("Validated Cards");
    	else
    		System.out.println("Not Validated Cards");
    }
}
