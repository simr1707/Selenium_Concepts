package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\SeleniumTesting\\testing\\browser.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser= prop.getProperty("browser");
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
			driver= new FirefoxDriver();	
		}else if (browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTesting\\SeleniumJars\\chromedriver.exe");
				driver= new ChromeDriver();
		}else {
			System.setProperty("webdriver.safari.driver", "C:\\SeleniumTesting\\SeleniumJars\\safaridriver.exe");
			driver= new SafariDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bdhshf");
		driver.findElement(By.id("pass")).sendKeys("hgdgd");
		driver.findElement(By.tagName("button")).click();
		
	}

}
