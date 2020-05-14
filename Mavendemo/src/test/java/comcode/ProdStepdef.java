package comcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;

public class ProdStepdef {
	@Then("^We Should be Ok$")
	public void we_Should_be_Ok() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("http//:www.yahoo.com");
	
		
		
		
	}

	@Then("^I should Ok$")
	public void i_should_Ok() throws Throwable {
	   
	    
	}

}
