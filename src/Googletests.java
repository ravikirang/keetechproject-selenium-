import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Googletests {
	public static   WebDriver driver=new FirefoxDriver();
	
	@Test
	public void search()
	{
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.id("lst-ib"));
		search.clear();
		search.sendKeys("keetech");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		String actualtext=driver.findElement(By.className("_Rm")).getText();
		String expected="www.keetechsoft.com/";
		
		Assert.assertEquals(actualtext, expected);
	}
}
