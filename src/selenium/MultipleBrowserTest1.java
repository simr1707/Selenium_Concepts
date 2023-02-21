package selenium;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest1 {
	
	public static void main(String[] args) throws IOException {
		Xls_Reader d = new Xls_Reader("C:\\SeleniumTesting\\testing\\NikulTest.xlsx");
		
		//chrome,safari   we will read this value from data file like excel file
		String browser= d.getCellData("Data1", "Browser", 2);
		//String browser = prop.getProperty("browser");
		
		WebDriver driver;
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumTesting\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}else{
			System.setProperty("webdriver.safari.driver","C:\\SeleniumTesting\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("jusxsj");
		driver.findElement(By.id("pass")).sendKeys("uxshdjws");
		driver.findElement(By.name("login")).click();

	}

}
