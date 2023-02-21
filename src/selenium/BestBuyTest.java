package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://bestbuy.ca/");
		// get size and text for the list for the shop 
		
		driver.findElement(By.xpath("//li[@data-automation='shop']")).click();;
		//driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		Thread.sleep(3000);
		
		//xpath:  (//div[@data-automation='menu-main-l1'])[1]/a
		List<WebElement> options = driver.findElements(By.xpath("(//div[@class='scrollWrapper_YCQ-X'])[1]/a"));
		System.out.println(options.size());
		for(WebElement a: options) {
			System.out.println(a.getText());
		}
	}
}
