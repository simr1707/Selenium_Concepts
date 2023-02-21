package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
		
		//WebElement footer=driver.findElement(By.id("pageFooterChildren"));
		//List<WebElement> allLinks =footer.findElements(By.tagName("a"));
		
		//List<WebElement> allLinks= driver.findElement(By.xpath("//ul[contains(@class ,'uiList pageFooterLinkList ')]/li"));
		//List<WebElement> allLinks= driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		
		List<WebElement> allLinks= driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
		System.out.println(allLinks.size());
		
		for (int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}
	}
}
