package Commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sukhd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://demo.guru99.com/test/delete_customer.php");
	
		driver.findElement(By.name("submit")).click();
	Alert alt= driver.switchTo().alert();
	System.out.println("Text is:" +alt.getText());
	alt.sendKeys("123");
	alt.accept();
	//alt.dismiss();
 }
}
  

	



