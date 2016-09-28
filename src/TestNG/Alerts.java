package TestNG;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
public class Alerts {
	
	public WebDriver driver;
	@Test
	public void f() throws Exception {
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("30")).click();
		
/*newSelect(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")))
							.selectByVisibleText("9 Adults");
newSelect(driver.findElement(By.id("ctl00_mainContent_ddl_Child")))
							.selectByVisibleText("2 Children");
newSelect(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")))
							.selectByVisibleText("1 Infant");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}*/


   WebElement select1=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
      Select select=new Select(select1);
      select.selectByVisibleText("4 Adults");
      
     
	}

	


	@Test
		public void verifyalerts() {
		String str;
		str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}
}

