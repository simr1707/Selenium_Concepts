package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable= driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size()>0) {
			System.out.println("Sortable present");
		}else {
			System.out.println("Sortable not present");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if (draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not present");
			}
		driver.switchTo().frame(0);  //By Index
		//driver.switchTo().frame("demo-name");  //only for name or id .	
		//driver.switchTo().frame(driver.findElement(By.className("demo-name"))); // By WebElement
		//driver.switchTo().parentFrame():// to switch backward to parent frame
		System.out.println("----------switched to the frame----------");
		sortable= driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size()>0) {
			System.out.println("Sortable present");
		}else {
			System.out.println("Sortable not present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if (draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not present");
			}
		driver.switchTo().defaultContent();
		System.out.println("------Switching back to main page--------");
		sortable= driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if (sortable.size()>0) {
			System.out.println("Sortable present");
		}else {
			System.out.println("Sortable not present");
		}
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if (draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not present");
			}
}
}