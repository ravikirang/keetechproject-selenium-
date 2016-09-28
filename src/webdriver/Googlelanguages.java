package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlelanguages {
	public WebDriver driver;
	public void openURL(){
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	public void clicklinks(String str) throws Exception{
		driver.findElement(By.xpath(str)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(3000);	
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Googlelanguages g = new Googlelanguages();
		g.openURL();		
		g.clicklinks("//*[@id='_eEe']/a[1]");//Hindi
		g.clicklinks("//*[@id='_eEe']/a[2]");//Bengali
		g.clicklinks("//*[@id='_eEe']/a[3]");//Telugu
	}
}
