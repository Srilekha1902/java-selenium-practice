package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
		
        //TAGNAME[ATRRIBUITE NAME='VALUE']-->formula
      WebElement un=driver.findElement(By.cssSelector("INPUT[placeholder='Username']"));
      WebElement pw=driver.findElement(By.cssSelector("INPUT[data-test='password']"));
      WebElement log=driver.findElement(By.cssSelector("INPUT[id='login-button']"));
      un.sendKeys("standard_user");
      pw.sendKeys("secret_sauce");
      un.click();
      pw.click();
      log.click();
      
	}

}
