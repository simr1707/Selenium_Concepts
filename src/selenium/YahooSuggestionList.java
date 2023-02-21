package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.name("p")).sendKeys("canada");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(options.size());
		
		for (WebElement i: options) {
			System.out.println(i.getText());
		}

	}


	}


