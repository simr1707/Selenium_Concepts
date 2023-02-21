package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\\\SeleniumJars\\\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//parentClassName(InterfaceName) objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");  
		
		driver.findElement(By.id("email")).sendKeys("sadgsdhgsayhagstsarfasgfa"); 
		driver.findElement(By.id("pass")).sendKeys("safsdagsdagdthgsdgsd"); 
		driver.findElement(By.name("login")).click();

	}

}
