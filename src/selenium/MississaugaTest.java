package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		//get size and text for our organization
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		//driver.findElement(By.xpath("(//button[@class='dropdown-toggle'])[3]")).click();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(options.size());
		for (WebElement a: options) {
			System.out.println(a.getText());
		}
		}

}
