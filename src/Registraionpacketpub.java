import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registraionpacketpub {
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("https://www.packtpub.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	@Test
	
	public void registraionpage(){
		Packetpubregistration pr=new Packetpubregistration(driver);
		pr.registration("ravikirangudla@gmail.com", "ravi", "kiran", "ammananna", "ammananna");
		
		
	}

}
