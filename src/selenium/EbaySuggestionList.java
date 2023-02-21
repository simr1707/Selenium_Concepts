package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("canada");
		Thread.sleep(2000);
		List<WebElement> options= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(options.size());
		
		for	(WebElement a: options) {
			System.out.println(a.getText());
		}
	

	}

}
