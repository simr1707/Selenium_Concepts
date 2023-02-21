package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(3000);
		WebElement careers= driver.findElement(By.linkText("Careers"));
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		System.out.println(careers.getLocation()); // to print the location of the element
		/*option1  scroll by x, y coordinate
		jse.executeScript("window.scrollBy(0,6000)");
		careers.click();
		*/
		/* option 2 scroll until the element is in view
		jse.executeScript("arguments[0].scrollIntoView(true);", careers);
		careers.click();
		*/
		//option-3 direct click on the element
		jse.executeScript("arguments[0].click();",careers );
		


}
}
