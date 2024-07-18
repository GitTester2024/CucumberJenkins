package modules;

import org.openqa.selenium.WebDriver;

import pages.LaunchPage;

public class LaunchModule {
	
	LaunchPage lp;
	WebDriver driver;

	public LaunchModule(WebDriver driver) {
		this.driver = driver;
		lp = new LaunchPage(driver);
		
	}


	public void openurl() {
		lp.openurl();
				
	}

}
