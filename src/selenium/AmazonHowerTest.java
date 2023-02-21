package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHowerTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		Thread.sleep(30000);
	
		WebElement anyname = driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(anyname).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(all.size());
		for (WebElement a: all) {
			System.out.println(a.getText());
		}
		

	}

}
