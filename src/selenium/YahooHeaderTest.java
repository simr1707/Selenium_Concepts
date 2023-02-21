package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://ca.yahoo.com/");
		//check links and print the headers
		List<WebElement> header = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		System.out.println(header.size());
		
		for (WebElement i: header) {
			System.out.println(i.getText());
		}

	}

}
