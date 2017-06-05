package com.unisuper.assignment.Angular.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.unisuper.assignment.Angular.Page.ToDoMVCpage;
import com.unisuper.assignment.Angular.Utils.GenericUtils;
import com.unisuper.assignment.Angular.Utils.WebDriverManager;

public class TestClass {
	
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	public ToDoMVCpage POM;
	public GenericUtils utils;
	
	// can be modified as per request .. providing the same as chrome
	public String browserName="chrome";

	
	@BeforeMethod
	public void beforeMethod()
	{
		 driver = WebDriverManager.getDriver(browserName);
		 wait= new WebDriverWait(driver,5000);
		 action = new Actions(driver);
		 POM = PageFactory.initElements(driver,ToDoMVCpage.class);
		 driver.navigate().to("http://todomvc.com/examples/angularjs/#/");
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 utils= new GenericUtils(driver);
	}
	
	
	@Test
	public void AddTodo()
	{	
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);		
		utils.clickElement(POM.CircleToComplete);
		
		//validate the task is added 
	}
	@Test
	public void EditExistingTodo()
	{	
			
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		
		action.doubleClick(POM.LabelToEdit).build().perform();
		utils.enterText(POM.ExistingToDoEditTextBox, "modified To do test 1");
		POM.ExistingToDoEditTextBox.sendKeys(Keys.ENTER);
		
		
		//validate the task is modified 

		
	}
	
	@Test
	public void CompleteTodo()
	{	
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		utils.clickElement(POM.CircleToComplete);
		
		
		
		
	}
	
	@Test
	public void ReactivateCompleteTodo()
	{	
	

		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		utils.clickElement(POM.CircleToComplete);
		utils.clickElement(POM.CircleToComplete);
	}
	
	@Test
	public void Add2Todo()
	{	
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 2");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		
		
	}
	
	@Test
		public void CompleteALLTodo()
		{	
			
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 2");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 3");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
			
		utils.clickElement(POM.ToggleAllCheckBox);	
			
			
		}
	
	@Test
	public void CompleteTodoFilter()
	{	
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 2");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 3");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
			
		utils.clickElement(POM.ToggleAllCheckBox);	
		
		utils.clickElement(POM.Completed);
		
		
		
		
	}
	
	@Test
	public void DeleteTodo()
	{	
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 2");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 3");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
			
	
		action.moveToElement(POM.LabelToEdit).build().perform();
		
		utils.clickElement(POM.deleteTodoBtn);	
	
				
	}
	
	
	@Test
		public void DeleteAllTodo()
		{	
			
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 1");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 2");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.AddToDoTextBox);		
		utils.enterText(POM.AddToDoTextBox, "To do test 3");
		POM.AddToDoTextBox.sendKeys(Keys.ENTER);
		
		utils.clickElement(POM.ToggleAllCheckBox);	
		
		utils.clickElement(POM.ClearCompletedBtn);

		}
		
	
	@AfterMethod
	public void AfterMethod()
	{
		driver.close();
		
	}
	
	

}
