package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=ulrtXsigI_w&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoidWxydFhzaWdJX3ciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2MjE5MzIzMywiaWF0IjoxNjYyMTkyMDMzLCJqdGkiOiI4MTBmODU5ZC1jZGMxLTQ3ZTQtYjUwMi1lMjQ0MzFjMDE1NGUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.uHbKXWkjj5clYYFa3c5l8ITWvbop6B5AxN5axJJ2X6GTk7ewuaZpZUmMRWpTBgXP7_RHLyzLgr6LMuTRARfhymXVTfb_odDY_ap_No3ZdbrVfKp3yWoI3AIVgV8MsTDp6z7rMieuO_MphzAppmfRIQt_Xy5BLsuWualUipzYDK827NjrtTEiqaeTcw_GhHTIb3V8oggjdZppKSQbc4OuATyPGU76GS6uv5YR9db6z2rQeKsR2dx2idgjpg2xvPLv_5kZgWijtCdCHhhMp-ZmI0TVS_cEnvKms8WEXYg4qTrymX0nhimTZ7crMkRak5nqjz4HzCoQb7S0ZfXhpL_4Bg&preferred_environment=");
		driver.findElement(By.id("usernameInput-input")).sendKeys("jhbdh$%^4");
		driver.findElement(By.name("password")).sendKeys("JH$%$&^*lhggc4");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);
		
		String expectedError = "Please enter a username or card number without special characters.";
		String actualError = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualError);
		
		if (actualError.equals(expectedError)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
