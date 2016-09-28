package webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/eclipse%20mars/SeleniumTest/home.html");
		driver.manage().window().maximize();
		
		//this timeout is applicable for the entire driver life cycle
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.switchTo().frame("myHeader");
		WebElement hi=driver.findElement(By.xpath("//h3[contains(text(),'Welcome')]"));
		System.out.println(hi.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myNavigation");
		driver.findElement(By.xpath(".//*[@id='myTree']")).click();
		driver.findElement(By.xpath(".//*[@id='hidden-branch']/a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myDetail");
		driver.findElement(By.xpath(".//*[@id='myBtn']")).click();*/
	//	driver.switchTo().defaultContent();
	//	driver.switchTo().frame("subFrame");
//		WebElement w=driver.findElement(By.linkText("frameHeader"));
//		w.click();
//		System.out.println("header is"+w.getText());
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("myDetail");
//	    WebElement el=driver.findElement(By.linkText("click me to open a new window"));
//	    el.click();
//	    System.out.println("text is:"+ el.getAttribute("value"));
//	    System.out.println("text is:"+ el.getText());
	/*    driver.switchTo().defaultContent();
	    driver.switchTo().frame("myDetail");
	    WebElement we=driver.findElement(By.linkText("click me to	open a new window"));
	    we.click();
	    System.out.println("Current window id: "+driver.getWindowHandle());
	    String parentwindowid = driver.getWindowHandle();
		System.out.println("parentwindow: "+parentwindowid);
        Set<String> setwindowids = driver.getWindowHandles();
	for(String window: setwindowids){
		if(window.equals(parentwindowid))
			continue;
		else
			driver.switchTo().window(window);
			break;
		}
		System.out.println("Current window title: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "satix new window");
		driver.findElement(By.id("newInputText")).sendKeys("hi kiran");*/
		
		WebElement clickmeelement=driver.findElement(By.linkText("click me to open a new window"));
		  clickmeelement.click();
		  System.out.println("Current window id: "+driver.getWindowHandle()); 
		  String parentwindowid = driver.getWindowHandle();
		  Set<String> setwindowids = driver.getWindowHandles();
		  for(String window: setwindowids){
		   if(window.equals(parentwindowid))
		    continue;
		   else
		    driver.switchTo().window(window);
		   
		  }
		  System.out.println("Current window title: " +driver.getTitle());
		  Assert.assertEquals(driver.getTitle(), "satix new window");
		  driver.findElement(By.id("newInputText")).sendKeys("Hi kiran");
		  driver.close();
		
	    

	}

}
