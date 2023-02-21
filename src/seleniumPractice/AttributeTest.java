package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		String s= driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
		String v = driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(v);
		

	}

}
