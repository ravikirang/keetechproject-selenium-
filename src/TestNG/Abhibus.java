package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Abhibus {
	WebDriver driver;
  @Test
  public void Search() {
	  driver.findElement(By.id("source")).sendKeys("Hyderabad");
	  driver.findElement(By.id("destination")).sendKeys("Guntur");
	  driver.findElement(By.id("datepicker1")).click();
	  driver.findElement(By.linkText("4")).click();
	  driver.findElement(By.linkText("Search")).click();
	  
	  String parentwindowid=driver.getWindowHandle();
	  System.out.println("parentwindowid:"+parentwindowid);
	  WebElement A =
			  driver.findElement(By.linkText("Log In / Sign Up"));
        A.click();
	  /*Actions action = new Actions(driver);
	  action.moveToElement(ApplyOnlineelement);
	  action.build().perform();*/

	  
	  System.out.println("Current window id: "+driver.getWindowHandle());
	  Set<String> setwindowids = driver.getWindowHandles();
	  for(String window: setwindowids){
	   if(window.equals(parentwindowid))
	    continue;
	   else
	    driver.switchTo().window(window);

	  }
	  System.out.println("Current window title: " +driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Login to your AbhiBus Account");
	  driver.findElement(By.xpath(".//*[@id='Form1']/div[8]/a[1]/img")).click();
	  driver.switchTo().window(parentwindowid);
	  System.out.println("Current window:"+ driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.abhibus.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

 /* @AfterTest
  public void afterTest() {
	  driver.quit();
  }*/

}
