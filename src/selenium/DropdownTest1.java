package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/");
		
		//size and text for dropdown
		List<WebElement> allOptions= driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(WebElement i: allOptions) {
			if(i.isSelected()) {
				System.out.println(i.getText() +"----- True");
			}
		}
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		s.selectByValue("267");
		Thread.sleep(2000);
		
		System.out.println("----------After selection-----------");
		
		for(WebElement i: allOptions) {
			if(i.isSelected()) {
				System.out.println(i.getText() +"----- True");
			}
		
		
	}
	}
}

