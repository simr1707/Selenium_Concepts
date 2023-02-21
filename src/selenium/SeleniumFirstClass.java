package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		// ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //open firefox
		driver.get("https://www.facebook.com/"); //open facebook
		
		driver.findElement(By.id("email")).sendKeys("gyugdsf"); //type wrong email address
		driver.findElement(By.id("pass")).sendKeys("sinrmeminm"); // any wrong password
		driver.findElement(By.name("login")).click(); //click on the login button

	}

}
