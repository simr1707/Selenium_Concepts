package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("canada");
		Thread.sleep(3000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(suggestions.size());
		
		//for(int i=0; i<suggestions.size();i++) {
			//System.out.println(suggestions.get(i).getText());
		for(WebElement a : suggestions) {
			System.out.println(a.getText());
		}
		

	}

}
