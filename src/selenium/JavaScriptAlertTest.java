package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(3000);
		
		// for java script popup
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();  // clicks on the non-selected button
		//al.accept();  //clicks on the selected button
		Thread.sleep(3000);
		driver.findElement(By.name("B3")).click();
		al.sendKeys("Selenium");
		Thread.sleep(3000);
		al.accept();
	}

}
