import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LpuUms {

    WebDriver driver;

    public void chromeLauncher() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://ums.lpu.in/lpuums/");

        // Method2
        WebElement username = driver.findElement(By.name("txtU"));
        username.clear();
        username.sendKeys("12002239");
        username.sendKeys(Keys.ENTER);
        

//        driver.findElement(By.className("input_type_pass")).click();
        

//       driver.findElement(By.xpath("//*[@id=\"TxtpwdAutoId_8767\"]")).click();
       WebElement Password = driver.findElement(By.xpath("//*[@id=\"TxtpwdAutoId_8767\"]"));
       Password.sendKeys("1");
       Password.sendKeys(Keys.ENTER);

//        Thread.sleep(6000);
//        driver.findElement(By.id("iBtnLogins")).click();
    }

    public static void main(String[] args) throws Exception {
		LpuUms c= new LpuUms();
		c.chromeLauncher();
	}
}