package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Facebookloginlogout {
	WebDriver driver;

  @Test(dataProvider="usernamepasswordprovider")
  public void facebooklogin(String username, String pwd) {
	    driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_l")).click();
		System.out.println("facebooklogin successful");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void logout() throws InterruptedException {
	    driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
		System.out.println("facebook logout successful");

	  
  }

  @DataProvider(name="usernamepasswordprovider")
  
  public Object[][] getusernamepassword() throws FileNotFoundException, IOException
  {
	  Properties props=new Properties();
	//  props.load( new FileReader("E:\\seleniumprograms\\SeleniumAutomation\\src\\TestNG\\username.properties"));
	  props.load(new FileInputStream(new File("E:\\seleniumprograms\\SeleniumAutomation\\src\\TestNG\\username.properties")));
	  String s1=props.getProperty("username");
	  String s2=props.getProperty("password");
	  String[][] stringarray=new String[2][2];
	  stringarray[1][0]=s1;
	  stringarray[1][1]=s2;
	  return stringarray;
	  
	  
	  
			  
			  
  }
}
