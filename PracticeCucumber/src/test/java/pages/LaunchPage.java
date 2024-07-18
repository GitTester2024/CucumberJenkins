package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage {
	
	WebDriver driver;
	public LaunchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public void openurl() {
	
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
	}

}
