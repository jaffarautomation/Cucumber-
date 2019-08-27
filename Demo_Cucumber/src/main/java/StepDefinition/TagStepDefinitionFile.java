package StepDefinition;

import cucumber.api.java.en.Given;


//In real life scenario, we dont need to run every method in step definition file, some method are for sanity and some are for regression test
//With  help of tags we run run method according to tags which we defined in the feature file above the scenario.
//We need to pass the tags in runner file.
//If we pass only @smokeTest in runner file, only @somketest scenario will and  other scenario will not run.



public class TagStepDefinitionFile {

	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   
	}

	@Given("^user is check title test case$")
	public void user_is_check_title_test_case() throws Throwable {
	    	}

	@Given("^this is home page title test case$")
	public void this_is_home_page_title_test_case() throws Throwable {
	 
	}

	@Given("^this is address link test case$")
	public void this_is_address_link_test_case() throws Throwable {
	   
	}

	@Given("^this is address page test case$")
	public void this_is_address_page_test_case() throws Throwable {
	    
	}

	@Given("^this is address field are displayed test case$")
	public void this_is_address_field_are_displayed_test_case() throws Throwable {
	    
	}

	@Given("^this is address button visible test case$")
	public void this_is_address_button_visible_test_case() throws Throwable {
	   
	}

	@Given("^this is check address is added test case$")
	public void this_is_check_address_is_added_test_case() throws Throwable {
	   
	}

	@Given("^this is delete address button visible test case$")
	public void this_is_delete_address_button_visible_test_case() throws Throwable {
	    
	}

	@Given("^this is delete page title test case$")
	public void this_is_delete_page_title_test_case() throws Throwable {
	    ;
	}

	@Given("^user is on login pagess$")
	public void user_is_on_login_pagess() throws Throwable {
	 
	}

	@Given("^user is on login pagessss$")
	public void user_is_on_login_pagessss() throws Throwable {
	  
	}


	
	
}
