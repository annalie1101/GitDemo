package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMobileValidation() {
		System.out.println("Before mobile.");
	}
	
	@After("@MobileTest")
	public void afterMobileValidation() {
		System.out.println("After mobile.");
	}
	
	@Before("@WebTest")
	public void beforeWebValidation() {
		System.out.println("Before Web.");
	}
	
	@After("@WebTest")
	public void afterWebValidation() {
		System.out.println("After Web.");
	}
}
