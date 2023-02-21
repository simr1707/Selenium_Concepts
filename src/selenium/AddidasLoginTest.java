package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("shgdsh@cusy.com");
		driver.findElement(By.id("login-password")).sendKeys("bshgd537838");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		String expectedError = "Your request timed out – please retry";
		String actualError = driver.findElement(By.xpath("//div[@data-auto-id= 'login-error-message']")).getText();
		System.out.println(actualError);
		
		if (expectedError.equals(actualError)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		

	}

}
