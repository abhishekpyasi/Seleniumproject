package techmahindra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSelenium {
	
	@Test
	public void loginToGoogle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\Documents\\Development\\ChromeDriver\\ChromeDriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.quit();
	}
}



