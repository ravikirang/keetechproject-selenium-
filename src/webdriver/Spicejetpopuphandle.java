package webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.servlet.ServletContextHandler;
public class Spicejetpopuphandle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://book.spicejet.com/Select.aspx");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.linkText("Bengaluru (BLR)")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.linkText("Hyderabad (HYD)")).click();
        driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
        driver.findElement(By.linkText("14")).click();
       new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2 Adults");
       new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("2 Children");
       new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText("2 Infants");
       
	}

}
