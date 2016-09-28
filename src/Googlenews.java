import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Googlenews {
	
	//WebDriver driver=Googletests.driver;
	WebDriver driver=new FirefoxDriver();
	@Test
	public void Googlenews(){
		driver.findElement(By.linkText("News")).click();
		String expextedtext="Las Vegas, Nevada, United States";
		String actualtext=driver.findElement(By.xpath("//[div[contains(text(),'Las Vegas, Nevada, United States']")).getText();
		Assert.assertTrue(actualtext.contains(expextedtext));
		
	}

}
