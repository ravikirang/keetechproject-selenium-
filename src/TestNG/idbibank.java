package TestNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class idbibank {
WebDriver driver;
@BeforeClass
public void idbidropdown()
{
driver=new FirefoxDriver();
driver.get("http://www.idbi.com/index.asp");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@Test
public void dropdown()
{
WebElement select=driver.findElement(By.id("urlValue"));
Select select1=new Select(select);
select1.selectByVisibleText("Cards");
}
@Test
public void login()
{
WebElement el=driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/a/img"));
el.click();
//}
//@Test
//public void windowhandle()
//{
String parentwindowid=driver.getWindowHandle();
 System.out.println("parentwindowid:"+parentwindowid);
// WebElement A =
//driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[2]/div/input"));

 /*Actions action = new Actions(driver);
 action.moveToElement(ApplyOnlineelement);
 action.build().perform();*/

 //A.sendKeys("94920");
 System.out.println("Current window id: "+driver.getWindowHandle());
 Set<String> setwindowids = driver.getWindowHandles();
 for(String window: setwindowids){
  if(window.equals(parentwindowid))
   continue;
  else
   driver.switchTo().window(window);
  driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[2]/div/input")).sendKeys("hbkuy");
driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table[3]/tbody/tr[2]/td[2]/div/input")).sendKeys("123456");
driver.findElement(By.id("button1")).click();
 }
 //System.out.println("Current window title: " +driver.getTitle());
 //Assert.assertEquals(driver.getTitle(), "IDBI Bank Ltd (IN)");
 //driver.close();
 driver.switchTo().window(parentwindowid);
 System.out.println("Current window:"+ driver.getTitle());;
}
}