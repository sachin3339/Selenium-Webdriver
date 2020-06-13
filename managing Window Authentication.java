package com.selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Authentication_Window {
 
	public static void main(String[] args) throws  IOException, InterruptedException {
		
		System. setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//username:password@
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String Msg=driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(Msg);
		driver.close();
		
		

	}
}
