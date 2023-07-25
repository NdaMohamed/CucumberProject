package StepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.loginPage;



public class LoginSteps{
	
	 public WebDriver driver;
		loginPage loginpage;
 
@Before
public void Setup() {
	 System.out.println("hellooo 1");
	
     System.setProperty(
             "webdriver.chrome.driver",
             "D:\\Projects\\EJ_CucumberProject\\src\\main\\resources\\driver\\chromedriver.exe");
//     System.setProperty("webdriver.http.factory", "jdk-http-client");
     driver= new ChromeDriver();
    
     driver.manage().window().maximize();  
     driver.get("https://www.saucedemo.com/");
      ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     loginpage=new loginPage(driver);
}

    @Given("browser is open")
    public void browser_is_open() {   
      System.out.println("browser is open");
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("hellooo 2");
//        driver.navigate().to("https://www.saucedemo.com/");
//        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("hellooo 3");
        loginpage.FillUserName("standard_user");
        loginpage.FillPassword("secret_sauce");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("hellooo 4");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hellooo 5");
        driver.findElement(By.className("app_logo")).isDisplayed();
        System.out.println("Wohowoooooo");
    }


}
