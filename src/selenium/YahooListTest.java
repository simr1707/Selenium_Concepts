package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> trending = driver.findElements(By.xpath("//div[@class='bd']//a"));
		System.out.println(trending.size());
		
		for (WebElement i: trending) {
			System.out.println(i.getText());
		
	}

}
}