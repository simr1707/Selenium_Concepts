package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumTesting\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.td.com/ca/en/personal-banking/?cm_sp=:GOOGLE:EN-+Bank+-+Brand+(22_S_BR_BAC_AO_ACQ_EN_NAT):DIF:Core+Brand+-+Broad&gclid=EAIaIQobChMI98CT7ZX8-QIVlwaICR1IAAygEAAYASAAEgJUJvD_BwE&gclsrc=aw.ds");
		
		//footer size 8 and print
		List<WebElement> footer =driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(footer.size());
		for (WebElement i: footer) {
			System.out.println(i.getText());
		}
	}
}
