package stepdefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public BaseClass() {
		
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
	
		
	}
	

}
