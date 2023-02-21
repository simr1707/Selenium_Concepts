package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		// ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //open firefox
		driver.get("https://www.facebook.com/"); //open facebook
		
		//2. cssSelector- syntax for css selector 
		driver.findElement(By.cssSelector("#email")).sendKeys("bdhshf");
		driver.findElement(By.cssSelector("#pass")).sendKeys("hgdgd");
		driver.findElement(By.tagName("button")).click();
	}



	}

