package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HookStepDefinitionfile {

	
	//These are called Hooks
	// After annotation is just like the after class method in TestNG.
	//This annotation will work for every scenario, for Ex if 2 scenario is defined then it will run for both scenario.
	//This is also called global annotation or global hook
	
	//For particular scenario if we want to run some pre-condition, then we need to defined some annoation in scenario and used in 'Before' or 'after'  annotation.
	//For ex: @Before("@First")
    // these are called tags hook
	
	//We can also used order just like 'Priority' in TestNG, it will executed the method in given ascending order 
	
	@After(order=0)
	public void teardown()
	{
		
		System.out.println("This method close the browser");
	}
	
	
	//This before annoatation is just like the before class method in testng
	@Before(order=0)
	public void setup()
	{
		
		System.out.println("This method open the browser");
	}
	
	
	@After(order=1)
	public void teardown1()
	{
		
		System.out.println("This method close the browser1");
	}
	
	
	//This before annoatation is just like the before class method in testng, here we are using order just like priority in testng
	//this annotation is also global, but will run before the first global annoation
	@Before(order =1)
	public void setup1()
	{
		
		System.out.println("This method open the browser1");
	}
	
	
	
	
	//This is local annotation and run before the first scenario 
	@Before("@First")
	public void beforefirst()
	
	{
		System.out.println("This method will run before the first sceanrio only");
	}
	
	
	//this is local annotation and will run after the end of first scenario
	@After("@First")
	public void afterfirst()
	
	{
		System.out.println("This method will run after the first sceanrio only");
	}
	
	//This is local annotation and run second the first scenario 
	@Before("@Second")
	public void beforesecond()
	
	{
		System.out.println("This method will run before the second sceanrio only ");
	}
	
	//this is local annotation and will run after the end of second scenario
	@After("@Second")
	public void aftersecond()
	
	{
		System.out.println("This method will run after the second sceanrio only");
	}
	
	
	
	
	@Given("^userss is on login page$")
	public void userss_is_on_login_page() throws Throwable {
		
		System.out.println("User is on login page");
	    
	}

	@Then("^user enter login credentails$")
	public void user_enter_login_credentails() throws Throwable {
	    System.out.println("User enter login credentails");
	}

	@Then("^user is navigate to home page$")
	public void user_is_navigate_to_home_page() throws Throwable {
	  System.out.println("User enter in home page");
	}
	
	
	@Given("^userss is home login page$")
	public void userss_is_home_login_page() throws Throwable {
		
		System.out.println("User is on home page");
	  
	}

	@Then("^user enter click on  logout link$")
	public void user_enter_click_on_logout_link() throws Throwable {
	
		
		System.out.println("User click on logout link");
	}

	@Then("^user is navigate to login page$")
	public void user_is_navigate_to_login_page() throws Throwable {
	    
		System.out.println("User is navigated to login page");
	}
	
}
