package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BasePage {
	
	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//locators
	By UserName= By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.id("login-button");
	//functions
	public void FillUserName(String username) {
		ClearElement(UserName);
		SetText(UserName,username);
	}
	public void FillPassword(String psw) {
		ClearElement(password);
		SetText(password,psw);
	}
	public void ClickOnLoginbtn() {
		ClickOnElement(loginbutton);
	}
}
