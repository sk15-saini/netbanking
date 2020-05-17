package Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sukhd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	Select month=new  Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Mar");
		Select day=new  Select(driver.findElement(By.id("day")));
		day.selectByIndex(11);
		Select year=new  Select(driver.findElement(By.id("year")));
          year.selectByValue("1990");
          
	}

}
