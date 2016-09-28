import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Googlemaps {
	
	@Test

	public void maps(){
		
		WebDriver driver=Googletests.driver;
		driver.findElement(By.className("screen-mode"));
	
	}

}
