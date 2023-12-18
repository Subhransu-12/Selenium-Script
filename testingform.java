import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import zmq.socket.radiodish.Radio;


public class testingform  {
	
	WebDriver driver;
	public void chromeLauncher() throws Exception{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
//	Thread.sleep(3000);
	
	WebElement firstName=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[1]/input"));
	firstName.sendKeys("Akash");
	WebElement lastName=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input"));
	lastName.sendKeys("Kumar");
	
	
//	Radio selection
	WebElement radio1= driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[2]"));
	radio1.click();
	
//	Checkbox selection
	driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[2]")).click(); 
	driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[3]")).click();

	
//	Dropdown selection
	Select testDropDown = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[4]/select")));  
	testDropDown.selectByIndex(1);
	
	Select testDropDownMonth = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")));  
	testDropDownMonth.selectByIndex(1);
	
	Select testDropDownDay = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")));  
	testDropDownDay.selectByIndex(1);
	
	Select testDropDownYear = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")));  
	testDropDownYear.selectByIndex(1);
	
	WebElement phoneNumber=driver.findElement(By.name("phone"));
	phoneNumber.sendKeys("7979842902");
	
	WebElement uname=driver.findElement(By.name("username"));
	uname.sendKeys("akash970980");
	
	WebElement email=driver.findElement(By.name("email"));
	email.sendKeys("rajakash970980@gmail.com");
	
	
//	Image Insertion
	WebElement photo=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[9]/input"));
	photo.sendKeys("C:\\Users\\shubh\\OneDrive\\Desktop\\IMG_1189.jpg");
	
	WebElement about=driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[10]/textarea"));
	about.sendKeys("qwertyuiopasdfghjklzxcvbnm");
	
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("abc@123");
	
	WebElement c_password=driver.findElement(By.name("c_password"));
	c_password.sendKeys("abc@123");
	
//	driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[13]/input")).click();
	
//	driver.quit();
	
	
	}
	public static void main(String[] args)throws Exception {
		testingform d= new testingform();
		d.chromeLauncher();
		

	}

}
