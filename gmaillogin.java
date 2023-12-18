import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v113.domsnapshot.model.TextBoxSnapshot;



public class gmaillogin  {
	
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=AXo7B7Xo3TEJ9yKSOuH4M9u1BgjSTNIzGNsJ_YkvD_9qMg47OdshSek_uhTCpL009s4oBCNZxQS5&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1576802304%3A1693288696186554");
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kittu970980@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	
//	driver.quit();
	
	
	}
	public static void main(String[] args)throws Exception {
		gmaillogin d= new gmaillogin();
		d.chromeLauncher();
		

	}

}
