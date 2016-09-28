package TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
public class Gmail {
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
	/*@Test
	public void f() {
	driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span ")).click();
		driver.findElement(By.id("gb_71")).click();
	}*/
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
