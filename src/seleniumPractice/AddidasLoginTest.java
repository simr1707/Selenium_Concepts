package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddidasLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.adidas.ca/en/account-login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("login-email")).sendKeys("shgdsh@cusy.com");
		driver.findElement(By.id("login-password")).sendKeys("bshgd537838");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		String expectedErr = "Incorrect email/password – please check and retry";
		String  actualErr = driver.findElement(By.cssSelector("div[data-auto-id='login-error-message']")).getText();
		if (actualErr.equals(expectedErr)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.quit();
	}

}
