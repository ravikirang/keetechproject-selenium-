

import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	public class Gmailhome {

	    WebDriver driver;

	    By homePageUserName = By.xpath(".//*[@id='blueBarDOMInspector']/div[1]/div/div/div/div[1]/div[1]/h1/a/span");

	    

	    public Gmailhome(WebDriver driver){

	        this.driver = driver;

	    }

	    

	    //Get the User name from Home Page

	        public String getHomePageDashboardUserName(){

	         return    driver.findElement(homePageUserName).getText();

	        }

	}

