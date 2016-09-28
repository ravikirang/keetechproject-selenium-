import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Googlevideos {
	
	WebDriver driver=Googletests.driver;
	@Test
	public void Googlevideos(){
		
		driver.findElement(By.linkText("Videos")).click();
		String actualvideo=driver.findElement(By.xpath(".//*[@id='rso']/div/div[3]/div/div/div[2]/div[1]/cite")).getText();
		String expectedvideo="ENTRY DODGE RAM";
		Assert.assertTrue(actualvideo.contains(expectedvideo));
	}

}
