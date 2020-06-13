
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Error_Management {
public static void main(String[] args){
System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.africau.edu/images/default/sample.pdf");
		driver.manage().window().maximize();
driver.quit();
		}
		}