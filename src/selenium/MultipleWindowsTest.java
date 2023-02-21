package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1324676208%3A1663691124431797&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqyimTZjxUzRb4bCT_7FQZR0Us1n3O0Du-Pkt1AYk2IrlfvL9ogl14Fpfo2D0owBEFdEna0tg");
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		Set<String> allwindows= driver.getWindowHandles();  // to get the handles for the windows, it will be a set
		Iterator<String> itr = allwindows.iterator();   // to read from a set we use iterator
		String parentWindow= itr.next();                // .next is used to get the next handle
		String childWindow= itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);     // needs handles for the window we want to switch
		System.out.println(driver.getTitle());     //help page
		driver.close();                            // will close the window where we have the focus
		
		Thread.sleep(4000);
		driver.switchTo().window(parentWindow);     //handle of window
		System.out.println(driver.getTitle());      //gmail page
		driver.quit();                              //will close all windows and kill the driver
		

	}

}
