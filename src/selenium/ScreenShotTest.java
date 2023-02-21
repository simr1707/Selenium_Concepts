package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		
		//add Commons.io jar to the project
		
		File screenShotFile =driver.getScreenshotAs(OutputType.FILE); // this is for any class driver chromeDriver,FirefoxDriver
		//File scrFile=(TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // for webdriver
		FileUtils.copyFile(screenShotFile, new File("C:\\SeleniumTesting\\testing\\abc.png"));
	}

}
