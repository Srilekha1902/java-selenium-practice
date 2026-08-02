package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium is one of the depencies
//selenium is a interface
//Selenium is oherewise called as JAR file(combination of class and selenium)
//selenium uses webdriver -which is also interface
//Webdriver which initate the browser 
//Type casting---> interface to inteface, class to class --doing non related thing is called as Type cassting

public class BasicsOfSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();//here chromedriver is used as constructor
  driver.get("https://www.saucedemo.com");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Loading some arguments to method method overloading concept
  driver.manage().window().maximize();
  driver.navigate().back();
  driver.navigate().forward();
  driver.navigate().refresh();
  
	}

}
