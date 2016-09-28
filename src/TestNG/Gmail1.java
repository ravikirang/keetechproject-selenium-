package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Gmail1 {
	public WebDriver driver;

  @Test
            public void verifylogin() throws Exception {
			driver.findElement(By.id("Email")).sendKeys("ravikirangudla");
			driver.findElement(By.id("next")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("Passwd")).sendKeys("9885613180");
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(10000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webDriver.ie.driver", "E:\\");
	  driver = new InternetExplorerDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
}
