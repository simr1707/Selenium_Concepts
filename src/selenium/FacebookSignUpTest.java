 package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("firstname")).sendKeys("sudfjh");
		driver.findElement(By.name("lastname")).sendKeys("singh");
		driver.findElement(By.name("reg_email__")).sendKeys("2564512145");
		driver.findElement(By.id("password_step_input")).sendKeys("fjbd57ff");
		
		//month july10 ,2000
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByVisibleText("11");

		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("2000");
		
		
		//click on radio buttons
		/*
	    List<WebElement> allRadio = driver.findElements(By.id("u_3_o_sR"));
		Thread.sleep(4000);
		allRadio.get(1).click();
		*/
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();

	}

}
