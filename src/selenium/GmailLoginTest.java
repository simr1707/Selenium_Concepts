package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S302293449%3A1662310350631673&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmVTEceLqrsprJhgSjnw-77oGwJGgpqYT1n-igDLtZKF7PNpRU6VFg17PNbnL2Lj5AKztCSR6A");
		driver.findElement(By.id("identifierId")).sendKeys("hggjhf@xyz.com");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		Thread.sleep(3000);
		
		String actualErr =driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		String expectedErr = "Couldn’t find your Google Account";
		System.out.println(actualErr);
		
		if (actualErr.equals(expectedErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
