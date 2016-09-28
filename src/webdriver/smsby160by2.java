package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class smsby160by2 {
private static final WebElement MISC = null;
WebDriver driver;

public smsby160by2(WebDriver driver)
{
	this.driver=driver;
}

public void login(String un,String pwd){
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.xpath(".//*[@type='submit']")).click();
}

public void sendsms(String number,String msg)
{
	driver.switchTo().frame("by2Frame");

	
	driver.findElement(By.xpath(".//*[@id='frmDashboard']/div[1]/div[2]/div[1]/button")).click();
	//driver.findElement(By.xpath("//input[@id='LEOHLY']")).sendKeys(number);
	//driver.findElement(By.id("sendSMSMsg")).sendKeys(msg);
	driver.findElement(By.cssSelector("input[placeholder*='Enter Mobile Number']")).sendKeys(number);
	driver.findElement(By.cssSelector("textarea[placeholder*='Enter your message']")).sendKeys(msg);
	//driver.findElement(By.xpath(".//*[@id='88853555192']/td[2]")).click();
	//driver.findElement(By.xpath(".//*[@id='ulMsgs']/li[1]/a")).click();
	driver.findElement(By.id("btnsendsms")).click();
}
public void flipkarttab()
{
	driver.switchTo().defaultContent();
	//driver.findElement(By.id("aFindYogi")).click();
	//driver.switchTo().frame("google_ads_iframe_/10938363/V4_top_728x90_One_0");
//driver.findElement(By.xpath(".//*[@id='aFindYogi']/span")).click();
String parentwindowid=driver.getWindowHandle();
System.out.println("parentwindowid:"+parentwindowid);
WebElement element =driver.findElement(By.xpath(".//*[@id='aFindYogi']/span"));
element.click();

/*Actions action = new Actions(driver);
action.moveToElement(ApplyOnlineelement);
action.build().perform();
*/
System.out.println("Current window id: "+driver.getWindowHandle());
Set<String> setwindowids = driver.getWindowHandles();
for(String window: setwindowids){
 if(window.equals(parentwindowid))
  continue;
 else
  driver.switchTo().window(window);

}
System.out.println("Current window title: " +driver.getTitle());
Assert.assertEquals(driver.getTitle(), "Freedom Sale 1 Online at Best Price | Flipkart.com");
/*driver.close();
driver.switchTo().window(parentwindowid);
System.out.println("Current window:"+ driver.getTitle());
*/
driver.findElement(By.linkText("Log In")).click();

driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8885058850");
driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("8885058850");
driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
driver.close();
driver.switchTo().window(parentwindowid);

}
public void addcontact(String addname, String mob){
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@id='aContacts']")).click();
	driver.switchTo().frame("by2Frame");
	driver.findElement(By.xpath(".//*[@id='addname']")).sendKeys(addname);
	driver.findElement(By.xpath(".//*[@id='addmob']")).sendKeys(mob);
	WebElement  b=driver.findElement(By.id("addgenval"));
	b.isSelected();
	b.click();
	//driver.findElement(By.id("addgenval")).click();
	driver.findElement(By.id("adddcon")).click();
	
}
public void logout() {
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("html/body/div[2]/div/div[2]/button[4]")).click();
	
}
public void smscollection(){
	driver.findElement(By.xpath(".//*[@id='aSMSCollection']")).click();
	driver.findElement(By.id("spanCategories")).click();
	driver.findElement(By.xpath(".//*[@id='ulCategories']/li[4]")).click();
	
}
}
