import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTestScript  {
	
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	Thread.sleep(3000);
	driver.findElement(By.id("searchInput")).sendKeys("Rabindranath Tagore");
	
	driver.findElement(By.className("svg-search-icon")).click();
	
	System.out.println("This is title "+ driver.getTitle());
	}
	public static void main(String[] args)throws Exception { 
		demoTestScript d= new demoTestScript();
		d.chromeLauncher();

	}

}

