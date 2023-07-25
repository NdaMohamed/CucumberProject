package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver driver;
	By errorMsg=By.tagName("h3");
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String GetErrorText() {
		return GetElementText(errorMsg);
	}
	
	public void ClearElement(By locator) {
		driver.findElement(locator).clear();
	}

	public By getElementByText(String className,String text)
	{
	return	By.xpath("//'"+className+"'[contains(@content-desc,'"+text+"']");
		//return By.className("//'"+className+"'and contains(@content-desc,\"'"+text+"'\")]");
		//By.className("[className='"+className+"]'and [contains(text(),'"+ConDesc+"')]");
	}
	public void ClickOnElement(By element) {driver.findElement(element).click();}
	public void SetText(By element,String txt) {
		driver.findElement(element).sendKeys(txt);
	}
	public String GetElementText(By element)
	{
		String txt=driver.findElement(element).getText();
		return txt;
	}
	
	public WebElement GetElementbyIndex(By locatore, int Index)
	{
		WebElement element=driver.findElements(locatore).get(Index) ;
return element;
	}
}
