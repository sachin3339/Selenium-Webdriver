package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Component {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost:5000/dropdown");

		Select cars = new Select(driver.findElement(By.id("cars")));
		List<WebElement> list = cars.getOptions();
		for (WebElement it : list) {
			System.out.println(it.getText());
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.quit();

	}

}
