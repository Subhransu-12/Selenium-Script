import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa  {
	
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form/");
	driver.findElement(By.id("firstName")).sendKeys("Akash");
	driver.findElement(By.id("lastName")).sendKeys("Kumar");
	driver.findElement(By.id("userEmail")).sendKeys("kittu970980@gmail.com");
	driver.findElement(By.id("userNumber")).sendKeys("7979842902");
	
	driver.findElement(By.id("subjectsInput")).sendKeys("PCM");
	
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	
	WebElement photo=driver.findElement(By.id("uploadPicture"));
	photo.sendKeys("C:\\Users\\shubh\\OneDrive\\Desktop\\IMG_1189.jpg");
	
	
	driver.findElement(By.id("currentAddress")).sendKeys("Sartha Nalanda Bihar 80310");

	
	}
	public static void main(String[] args)throws Exception {
		demoqa d= new demoqa();
		d.chromeLauncher();
		

	}

}

