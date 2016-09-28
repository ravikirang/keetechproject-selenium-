import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Redbussignup {
	
	WebDriver driver;
	
	public Redbussignup(WebDriver driver){
		this.driver=driver;
	}
	
	
	
	public void signup(String email,String pw){
		driver.findElement(By.linkText("Sign Up / Sign In")).click();
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		
		WebElement fbbutton = driver.findElement(By.xpath("//button[text()='Sign in with Facebook']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", fbbutton);
		//window handle
		String parentwindowid=driver.getWindowHandle();
		  System.out.println("parentwindowid:"+parentwindowid);
		// WebElement windowusingfb =
				 // driver.findElement(By.xpath("//button[text()='Sign in with Facebook']"));

		 /* Actions action = new Actions(driver);
		  action.moveToElement(ApplyOnlineelement);
		  action.build().perform();*/

		  //windowusingfb.click();
		  System.out.println("Current window id: "+driver.getWindowHandle());
		  Set<String> setwindowids = driver.getWindowHandles();
		  for(String window: setwindowids){
		   if(window.equals(parentwindowid))
		    continue;
		   else
		    driver.switchTo().window(window);

		  }
		  System.out.println("Current window title: " +driver.getTitle());
		  Assert.assertEquals(driver.getTitle(), "Facebook");
		 /* driver.close();
		  driver.switchTo().window(parentwindowid);
		  System.out.println("Current window:"+ driver.getTitle());*/
		  
		  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email);
		  driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(pw);
		  driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();

	}

}
