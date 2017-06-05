package com.unisuper.assignment.Angular.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtils {
	
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void enterText(WebElement element, String value)
	{
		try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		if(element.isDisplayed())
		{
			element.clear();
			element.sendKeys(value);
			
		}
		}
		catch(ElementNotVisibleException e)
		{
			System.out.println("No such element is found on the page: "+element);
		}
		
	}
	
	public void clickElement(WebElement element)
	{
		try{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		if(element.isDisplayed())
		{
			element.click();
		}
		}
		catch(ElementNotVisibleException e)
		{
			System.out.println("No such element is found on the page , so not able to click: "+element);
		}
		
	}
	
	

}
