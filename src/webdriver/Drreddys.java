package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drreddys {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.drreddys.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Our Story")).click();
	//driver.findElement(By.xpath("//a[@class='videoLink']")).click();
	driver.findElement(By.xpath(".//*[@id='mainsiteWrapper']/header/nav/div/div/div[2]/div[2]/span[2]")).click();

	}

}
