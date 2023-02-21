package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// get size and text for the radio buttons milk butter cheese
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> allRadio = driver.findElements(By.name("group1"));
		System.out.println(allRadio.size());
		for(WebElement a: allRadio) {
			System.out.println(a.getAttribute("value")+"-------"+a.isSelected());
		}
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		allRadio.get(2).click();
		System.out.println("-----after selecting radio button---------");
		
		for(WebElement a: allRadio) {
			System.out.println(a.getAttribute("value")+"-------"+a.isSelected());
		}
		

	}

}
