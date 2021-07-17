package techmahindra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstSelenium {

	@Test
	public void loginToGoogle() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\Documents\\Development\\ChromeDriver\\ChromeDriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		/* driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
driver.quit();
WebElement element = driver.findElement(By.xpath("//input[@id='css']")) ;

driver.findElement(By.cssSelector("input[id='submit']")); */ 

		WebDriverWait wait = new WebDriverWait(driver ,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Gmail")));
		element.click();
		Thread.sleep(3000);
		driver.close();
	}
}



