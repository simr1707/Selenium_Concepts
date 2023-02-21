package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AliexpressHowerTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		//if popup available  ---.----.> close Popup...> Type Computer
		//no Popup    > Type computer
		Thread.sleep(3000);
		List<WebElement> popup1= driver.findElements(By.xpath("//img[@class='_24EHh']"));
		System.out.println(popup1.size());
		if(popup1.size()>0) {
			popup1.get(0).click();		
		}
		
		List<WebElement> popup2 = driver.findElements(By.xpath("//img[@src='https://img.alicdn.com/tfs/TB1a.Oge_M11u4jSZPxXXahcXXa-48-48.png']"));
		System.out.println(popup2.size());
		if(popup2.size()>0) {
			popup2.get(0).click();
		}
		List<WebElement> popup3= driver.findElements(By.xpath("//img[@class='close-btn']"));
		System.out.println(popup3.size());
		if(popup3.size()>0) {
			popup3.get(0).click();
		Thread.sleep(2000);
		
		WebElement men= driver.findElement(By.linkText("Men's Fashion"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("(//dl[@class='sub-cate-items'])[9]/dd/a"));
		System.out.println(allLinks.size());
		
		for( WebElement a: allLinks) {
			System.out.println(a.getText());
		}
}
}
}
