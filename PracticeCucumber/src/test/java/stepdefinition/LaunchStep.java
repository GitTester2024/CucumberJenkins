package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import modules.LaunchModule;

public class LaunchStep {
	
	LaunchModule launchmodule;
	WebDriver driver;
	BaseClass base;
	
	public LaunchStep(BaseClass base){
		this.base = base;
		this.driver = base.driver;
		launchmodule = new LaunchModule(driver);
		
	}
	
	@Given("I login to website")
	public void i_login_to_website() {
		launchmodule.openurl();	
		
	  
	}

}
