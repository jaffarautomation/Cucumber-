package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepDefinition {

	WebDriver driver;
	


@Given("^user is already on Login Page$")
public void user_is_already_on_Login_Page() {
   
	
	System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
    
}

@When("^title of login page amazon$")
public void title_of_login_page_amazon() {
 
	String title =driver.getTitle();
	Assert.assertTrue(title.contains("Online Shopping"), "Title validation fail");
	
	
}

@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username(String username, String password) {
    
	driver.findElement(By.xpath("//a[@class='nav-a nav-a-2'][@data-nav-ref='nav_ya_signin']")).click();
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	
	
    
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button()  {
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
	
}

@Then("^user is on home page$")
public void user_is_on_home_page()  {
 
String value=	driver.findElement(By.xpath("//a/span[@class='nav-line-1']")).getText();
Assert.assertTrue(value.contains("Hello"),"incorrect user name");	


}


@Then("^user close the browser$")
public void user_close_the_browser() {
   
	driver.close();
}

}
