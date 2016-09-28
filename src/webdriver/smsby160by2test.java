package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class smsby160by2test {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("http://www.160by2.com/Index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void sendsms()
	{
		smsby160by2 sms=new smsby160by2(driver);
		sms.login("8885058850", "ammananna123456");
		sms.sendsms("9492055182", "hi chaitu");
		sms.flipkarttab();
		sms.addcontact("ravi", "9533925514");
		sms.logout();
	}
	
}
