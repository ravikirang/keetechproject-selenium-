import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedbusAccount {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void account(){
		Redbussignup sign=new Redbussignup(driver);
		sign.signup("ravikirangudla@gmail.com", "8885058850");
		
	}

}

