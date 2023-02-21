package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.name("_nkw")).sendKeys("canada");
		Thread.sleep(2000);
		List<WebElement> header=  driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));
		System.out.println(header.size());
		
		for(WebElement i: header) {
			System.out.println(i.getText());
		}

	}

}
