package resuable;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utilities.BaseClass;


public class WebDriverHelper extends BaseClass
{
	
	public boolean findElement(By element)
	{
		return driver.findElement(element).isDisplayed();
	}
	public void sendText(By element, String text)
	{
		driver.findElement(element).sendKeys(text);
	}
	
	public void clickButton(By element)
	{
		driver.findElement(element).click();
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	public void hover(By element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(element)).perform();
	}
	
	public void switchHandles(int idx)
	{
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(idx));
	}

}
