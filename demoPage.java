import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v113.domsnapshot.model.TextBoxSnapshot;



public class demoPage  {
	
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://seleniumbase.io/demo_page");
	Thread.sleep(3000);
	//Text input 1
	WebElement search=driver.findElement(By.id("myTextInput"));
	search.sendKeys("Testing");

//	Text input 2
	driver.findElement(By.id("myTextarea")).sendKeys("Testing2");
	
	//cllicking button
	driver.findElement(By.id("myButton")).click();
	
	
	System.out.println("Text is : "+driver.findElement(By.id("pText")).getText());
	System.out.println("preFilledText is : "+driver.findElement(By.id("myTextInput2")).getAttribute("value"));
	driver.findElement(By.id("myTextInput2")).sendKeys("Changing pre filled text");
	System.out.println("preFilledText after changing is : "+driver.findElement(By.id("myTextInput2")).getAttribute("value"));
	System.out.println("Progress bar is : "+driver.findElement(By.id("progressBar")).getAttribute("value"));
	System.out.println("HTML METER : "+driver.findElement(By.xpath("//*[@id=\"meterBar\"]")).getAttribute("value"));
//	driver.findElement(By.xpath("//*[@id=\"checkBox6\"]")).click();
//	System.out.println("Slider value is :"+driver.findElement(By.id("progressBar")).getAttribute("value"));
	
	
	driver.quit();
	
	
	}
	public static void main(String[] args)throws Exception {
		demoPage d= new demoPage();
		d.chromeLauncher();
		

	}

}


