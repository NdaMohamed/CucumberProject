package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import Pages.loginPage;
import io.cucumber.java.Before;
public class BaseTest {

	 public WebDriver driver;
	 		loginPage loginpage;
	    
	 @Before
	public void Setup() {
		 System.out.println("hellooo 1");
		 driver= new ChromeDriver();
	        System.setProperty(
	                "webdriver.chrome.driver",
	                "D:\\Projects\\EJ_CucumberProject\\src\\main\\resources\\driver\\chromedriver.exe");
	        System.setProperty("webdriver.http.factory", "jdk-http-client");
	       
	        driver.manage().window().maximize();  
	        driver.get("https://www.saucedemo.com/");
	         ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        loginpage=new loginPage(driver);
	}
	 
	 
}
