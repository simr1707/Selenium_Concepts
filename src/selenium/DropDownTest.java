package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.ebay.ca/");
		//size and text for dropdown
		List<WebElement> allOptions= driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for (int i=0; i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText()+ "------" + allOptions.get(i).isSelected());
			//if (allOptions.get(i).isSelected()) {
				//System.out.println(allOptions.get(i).getText()+ " is default option");}
		}
		//select from dropdown- use inbuilt class - Select-  from selenium
		//pass WebElement as a parameter from where we want to select
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(0); //select art
		Thread.sleep(2000);
		s.selectByValue("2984"); //select baby
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books"); //select book
		Thread.sleep(2000);
		
		System.out.println("-------After Selection--------");
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText()+ "------" + allOptions.get(i).isSelected());
		}
		
        //36
		//All Categories-------true
		//-------------------------------After Selection----------------------------
		//Books-------true

	}
}
