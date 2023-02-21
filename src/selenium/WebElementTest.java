package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		// ClassName objName = new ClassName();x
		FirefoxDriver driver = new FirefoxDriver(); //open firefox
		driver.get("https://www.facebook.com/"); //open facebook
		
		
		//driver.findElement(By.id("email")).sendKeys("gyugdsf"); //type wrong email address
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("gyugdsf");
		
		//driver.findElement(By.id("pass")).sendKeys("sinrmeminm"); // any wrong password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sinrmeminm");
		
		//driver.findElement(By.name("login")).click(); //click on the login button
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
	}

}
