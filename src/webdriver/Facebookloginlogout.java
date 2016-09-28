package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookloginlogout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ravikirangudla@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8885058850");
		driver.findElement(By.id("u_0_m")).click();
		Thread.sleep(10000);
		System.out.println("facebooklogin successful");
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
		System.out.println("facebook logout successful");

	}

}
