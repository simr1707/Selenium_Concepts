package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // it just wait for the element,  not fix time  it is implicable all the line coming after that 
		//Thread.sleep(4000); FIX WAIT TIME
		
		driver.findElement(By.name("lastname")).sendKeys("singh");
		driver.findElement(By.name("reg_email__")).sendKeys("2564512145");
		driver.findElement(By.id("password_step_input")).sendKeys("fjbd57ff");
		
		//month july10 ,2000
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByVisibleText("10");

		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("2000");
		
		//click on radio buttons
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();

	}

	}

