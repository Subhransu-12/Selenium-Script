import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class amazon  {
	
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iqoo neo 7 pro");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	}
	public static void main(String[] args)throws Exception {
		amazon u= new amazon();
		u.chromeLauncher();

	}

}


