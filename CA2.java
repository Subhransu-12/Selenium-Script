

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CA2 {
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//	Select testDropDown = new Select(driver.findElement(By.id("multiselect")));  
//	testDropDown.selectByIndex(2);
	
	driver.findElement(By.xpath("//*[@id=\"multiselect1\"]/option[2]")).click();
	
	Select testDropDown2 = new Select(driver.findElement(By.xpath("//*[@id=\"drop1\"]")));  
	testDropDown2.selectByIndex(2);
//	driver.findElement(By.)
	
	driver.findElement(By.id("textbox1")).clear();
	driver.findElement(By.id("textbox1")).sendKeys("CLeard");
	
	
	driver.findElement(By.xpath("//*[@id=\"ta1\"]")).sendKeys("This is the demo text");
	
	driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).clear();
	driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).sendKeys("This is the demo text");
	 
//	System.out.println(driver.findElement(By.id("rotb")).getText());
//	Radio selection
	WebElement radio1= driver.findElement(By.id("radio1"));
	radio1.click();
//	Checkbox
	driver.findElement(By.id("checkbox1")).click(); 
	driver.findElement(By.id("checkbox2")).click();
	
	WebElement textElement = driver.findElement(By.xpath("//*[@id=\"HTML17\"]/h2"));
	System.out.println(textElement.getText());
	
	WebElement textElement2 = driver.findElement(By.id("rotb"));
	System.out.println(textElement2.getAttribute("value"));
	
	driver.findElement(By.id("alert1")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("prompt")).click();
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.id("confirm")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.name("textboxn")).sendKeys("This is the demo text");
	
//	Radio selection
	WebElement radio2= driver.findElement(By.xpath("//*[@id=\"HTML32\"]/div[1]/input[1]"));
	radio2.click();
//	Checkbox
	driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[1]")).click(); 
	driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[3]")).click();
	
	
	//	driver.quit();
	}
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method 
		CA2 ca2 = new CA2();
		ca2.chromeLauncher();
	}
}





