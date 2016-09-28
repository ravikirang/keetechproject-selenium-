package webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Hdfcwindowhandle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String parentwindowid = driver.getWindowHandle();
		System.out.println("parentwindow: "+parentwindowid);
		WebElement CreditCardElement = driver.findElement(By.xpath(".//*[@id='hometab1']/div[1]/div[1]/ul/li[1]/a"));
		CreditCardElement.click();
		System.out.println("Current window id: "+driver.getWindowHandle());
		Set<String> setwindowids = driver.getWindowHandles();
		for(String window: setwindowids){
			if(window.equals(parentwindowid))
				continue;
			else
				driver.switchTo().window(window);
			
		}
			System.out.println("Current window title: " +driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Digital Application Platform");
			
			driver.close(); //close child window
			driver.switchTo().window(parentwindowid);
			System.out.println("Current window:"+ driver.getTitle());
	}

	}

