package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		// ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //open firefox
		driver.get("https://www.facebook.com/"); //open facebook
		
		//EMAIL
		//1 className - class attribute- can't be used if space is there
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ghygfgf");
		
		//2. cssSelector- syntax for css selector 
		//driver.findElement(By.cssSelector(null));
		
		//3.id - id attribute- working
		driver.findElement(By.id("email")).sendKeys("bdhshf");
		
		//4. linkText - only for links
		//driver.findElement(By.linkText(null));
		
		//5. name - name attribute -working
		//driver.findElement(By.name("email")).sendKeys("ajhdjs");
		
		//6. partialLinkText - only for links
		//driver.findElement(By.partialLinkText(null));
		
		//7. tagName - not working, should be unique tag name
		//driver.findElement(By.tagName("input")).sendKeys("denjdhbj");
		
		//8. xpath - syntax for xpath
		//driver.findElement(By.xpath(""));
		
		//PASSOWRD
		driver.findElement(By.id("pass")).sendKeys("hgdgd");
		//driver.findElement(By.name("pass")).sendKeys("hgdgd");
		
		// LOGIN BUTTON
		driver.findElement(By.tagName("button")).click();
	}

}
