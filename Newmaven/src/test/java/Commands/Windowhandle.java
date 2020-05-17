package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle {
	WebDriver driver;
	@Test
	public void FirefoxDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sukhd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
driver.get("https://www.amazon.com");
driver.navigate().to("https://www.facebook.com/");

}
}
