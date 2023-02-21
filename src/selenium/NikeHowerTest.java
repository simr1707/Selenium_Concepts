package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeHowerTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		Thread.sleep(3000);
	
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
			builder.moveToElement(men).build().perform();
		Thread.sleep(3000);
		
		//div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2'])[7]/a
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(all.size());
		for (WebElement a: all) {
			System.out.println(a.getText());
		}
		

	}

}
