package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Onewaysearch {
	public WebDriver driver;
	public void openURl(){
		driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
	}
	public void verifyonewaysearch() throws Exception{
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.linkText("Hyderabad (HYD)")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Bengaluru (BLR)")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("30")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")))									.selectByVisibleText("3 Adults");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")))
							.selectByVisibleText("2 Children");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")))
							.selectByVisibleText("1 Infant");
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
}
	public void verufypopup() throws Exception{
		String str;
		str = driver.getWindowHandle();
		driver.findElement(By.id("popUpConverter")).click();
		Thread.sleep(5000);
		driver.switchTo().window("converter");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_Drop	DownListBaseCurrency"))).selectByVisibleText("US Dollars(USD)");	
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_Drop	DownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount							")).sendKeys("100");	
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")							).click();
		driver.findElement(By.id("ButtonCloseWindow")).click();
		driver.switchTo().window(str);
new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStat					ion1"))).selectByVisibleText("Ahmedabad (AMD)");
		driver.quit();
	}
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Spicejet_Onewaysearch s = new Spicejet_Onewaysearch();
		s.openURl();
		s.verifyonewaysearch();
		s.verufypopup();
	}
}
