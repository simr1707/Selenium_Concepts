package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassHowerTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	
		driver.get("https://www.ebay.ca/");
		//wait for the webElement elect
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// hower on the electronics section
		WebElement elect= driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(elect).build().perform();
		
		
		List<WebElement> list = driver.findElements(By.xpath("(//nav[@class='hl-cat-nav__sub-cat-col'])[7]//li"));
		System.out.println(list.size());
		
		/* for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i).getText());}  */
		for(WebElement i:list ) {
			System.out.println(i.getText());
		}
		
		

	}

}
