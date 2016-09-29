


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.testng.Assert;

	import org.testng.annotations.BeforeTest;

	import org.testng.annotations.Test;

	
	public class fbloginwithvalid {

	    WebDriver driver;

	    Gmaillogin objLogin;

	    Gmailhome objHomePage;

	    //before method comment addition for git test

	    @BeforeTest

	    public void setup(){

	        driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        driver.get("https://www.facebook.com/");

	    }

	    /**

	     * This test case will login in http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message

	     */

	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct(){

	        //Create Login Page object

	    objLogin = new Gmaillogin(driver);

	    //Verify login page title

	   /* String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
*/
	    //login to application

	    objLogin.loginTofb("ravikirangudla@gmail.com", "8885058850");

	    // go the next page

	    objHomePage = new Gmailhome(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("fbusername:ravikirangudla@gmail.com"));

	    }

}
