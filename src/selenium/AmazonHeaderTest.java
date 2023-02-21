package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.amazon.ca/");
		
//size and text for header around 25
		List<WebElement> header= driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
		System.out.println(header.size());
		
		//for (int i=0; i<header.size();i++) {
			//System.out.println(header.get(i).getText());}
		for (WebElement i: header) {
			System.out.println(i.getText());
		}
		
	}

}
