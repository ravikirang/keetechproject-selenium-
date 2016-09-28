import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rediffmailsignin {
	
	WebDriver driver;
	

	public Rediffmailsignin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signintorediffmail(String usernname , String password){
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys(usernname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	}

}
