package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		
		// the following code is wrong because using WebElement we can not verify if the Element is present or not. it will display error
	/*	if(driver.findElement(By.linkText("dcjkdgbc")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}	*/
		
		//only use list to verify
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}

	}

}
