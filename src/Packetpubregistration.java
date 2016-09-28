import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Packetpubregistration {
	
	WebDriver driver;
	
	
	public Packetpubregistration(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void registration(String email,String fn,String ln,String pw,String cpw){
		
		driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[2]/div")).click();
		driver.findElement(By.id("edit-email-address")).sendKeys(email);
		driver.findElement(By.id("edit-first-name")).sendKeys(fn);
		driver.findElement(By.id("edit-last-name")).sendKeys(ln);
		driver.findElement(By.id("edit-pass")).sendKeys(pw);
		driver.findElement(By.id("edit-confirm-password")).sendKeys(cpw);
		driver.findElement(By.xpath(".//*[@id='account-bar-login-register']/a[2]/div")).click();
		driver.findElement(By.id("edit-register")).click();
	}

}
