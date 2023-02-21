 package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317545724588&hvpos=&hvnetw=g&hvrand=13485709731540757766&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000838&hvtargid=kwd-296387478685&ref=pd_sl_5x1y8ilk72_e&hydadcr=20060_10818753&gclid=EAIaIQobChMI1q6Cp-jy-wIVrP3jBx0npwDtEAAYASAAEgKTbvD_BwE");
		
		Thread.sleep(2000);
		WebElement hower= driver.findElement(By.id("nav-link-accountList"));
			Actions builder = new Actions(driver);
			builder.moveToElement(hower).build().perform();
			
		List<WebElement> list= driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(list.size());
		for( int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
			

	}

}
