package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Idbi {
public static void main(String []args)
{ 
 WebDriver driver=new FirefoxDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 driver.get("http://www.idbi.com/index.asp");
 WebElement el=driver.findElement(By.xpath("//a[@title='Products Mouseover']"));
 el.click();
   System.out.println(el.getText());
   WebElement el1=driver.findElement(By.xpath("//li[@class='selected']/span[text()='Preferred Banking']"));
 System.out.println(el1.getText());
 el1.click();
 WebElement el2=driver.findElement(By.xpath("//a[text()='Royale Account']"));
 System.out.println(el2.getText());
 el2.click();
 WebElement el3=driver.findElement(By.xpath("//a[text()='Features']"));
 System.out.println(el3.getText());
 el3.click();
 WebElement el4=driver.findElement(By.xpath("//a[text()='How to Apply']"));
 System.out.println(el4.getText());
 el4.click();
 WebElement el6=driver.findElement(By.xpath("//a[@title='Products Mouseover']"));
 el6.click();
   WebElement el7=driver.findElement(By.xpath("//li[@class='selected']/span[text()='Preferred Banking']"));
  el7.click();
 WebElement el5=driver.findElement(By.xpath("//a[text()='Preferred Account']"));
 System.out.println(el5.getText());
 el5.click();
 driver.findElement(By.xpath("//a[@title='Products Mouseover']")).click();
 WebElement el8=driver.findElement(By.xpath("//li[@class='selected']/span[@class='mainlink']"));el8.click();
System.out.println(el8.getText()); 
driver.findElement(By.xpath("//a[@title='Products Mouseover']")).click();
WebElement el9=driver.findElement(By.xpath("//span[text()='Flexi Current Account']"));
el9.click();
driver.findElement(By.xpath("//a[@title='Products Mouseover']")).click();
WebElement el10=driver.findElement(By.xpath("//span[text()='Corporate Payroll Account']"));
el10.click();
System.out.println(el10.getText());
driver.findElement(By.xpath("//a[@title='Products Mouseover']")).click();
WebElement el11=driver.findElement(By.xpath("//span[text()='Fixed Deposit & Lockers']"));
el11.click();
driver.findElement(By.xpath("//a[@title='Products Mouseover']")).click();
WebElement el12=driver.findElement(By.xpath("//span[text()='Loans']"));
el12.click();
System.out.println(el12.getText());
driver.findElement(By.xpath("//a[@title='Products Mouseover']")).click();
WebElement el13=driver.findElement(By.xpath("//span[text()='Cards']"));
el13.click();
System.out.println(el13.getText());
 
}
}