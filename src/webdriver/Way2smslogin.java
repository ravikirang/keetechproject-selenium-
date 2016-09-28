package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Way2smslogin {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("8885058850");
		driver.findElement(By.id("password")).sendKeys("ammananna123456");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.id("mobile")).sendKeys("8885058850");
		driver.findElement(By.id("message")).sendKeys("hai kiran");
		driver.findElement(By.id("Send")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@class='lout']/i")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		

	}

}
