import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlertHandler {

	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("cusid")).sendKeys("12345");
	driver.findElement(By.name("submit")).click();
	
	String g= driver.switchTo().alert().getText();
	System.out.println(g);
	driver.switchTo().alert().accept();
	
	String g1= driver.switchTo().alert().getText();
	System.out.println(g1);
	driver.switchTo().alert().accept();
	driver.quit();
	}
	public static void main(String[] args) throws Exception{
		DemoAlertHandler demo= new DemoAlertHandler();
		demo.chromeLauncher();
		
	}
}

