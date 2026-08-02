package Selenium;

import org.apache.commons.math3.analysis.function.Add;
import org.apache.poi.ss.formula.functions.MatrixFunction.TwoArrayArg;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDayTwo {
	//what is webelement
	//whatever you see in webpage is webelement 
	//webelement is interface
	
	//what is  locator?
	//selenium locator concept will act ike a eye 
	//what is use of locator ?
	//to locate webelement 
	//it comes from by class of selenium
	//name
	//link text 
	//partial ink text 
	//css slector
	//class
	//xpath
	
	//DOM -backend page of your code is called as dom structure

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chrome options to control the signin of the chrome near that 3 dots.
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---guest"); //--to Add argumnets we need to use this and passing arguments in belowe.
		
		
		WebDriver driver=new ChromeDriver(co);//everytime you write programming this is mandatory 
		driver.get("https://www.saucedemo.com");//everytime you write programming this is mandatory 
		driver.manage().window().maximize();//everytime you write programming this is mandatory 

		
	  WebElement un =driver.findElement(By.id("user-name"));
	  WebElement pw=driver.findElement(By.name("password"));
	  WebElement log=driver.findElement(By.name("login-button"));
	 
	 
	  //half only (facebook=face)
	  un.sendKeys("standard_user");//sendkeys used to send pass value 
	  pw.sendKeys("secret_sauce");
	  log.click();
	  
	  //link text 
	  WebElement tw=driver.findElement(By.linkText("Twitter"));
	  //partial link text
	  WebElement fb=driver.findElement(By.partialLinkText("Face"));
	  tw.click();
	  fb.click();
	}

}
