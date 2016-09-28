import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signintests {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void validsignin(){
		
		Rediffmailsignin signin=new Rediffmailsignin(driver);
		signin.signintorediffmail("smartybecool","ammananna");
		driver.findElement(By.xpath(".//*[@id='boxscroll']/li[2]/a"));
		
	}
	
	@Test
    public void invalidsignin(){
		
		Rediffmailsignin signin=new Rediffmailsignin(driver);
		signin.signintorediffmail("smartbecool@rediffmail.com", "ammaanna");
		
		try{
			driver.findElement(By.xpath(".//*[@id='boxscroll']/li[2]/a"));
		}
		catch(NoSuchElementException e){

		
		
	}
	
}
}
