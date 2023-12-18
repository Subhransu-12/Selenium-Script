package CA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ums {

    WebDriver driver;

    public void chromeLauncher() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://ums.lpu.in/lpuums/");
        Thread.sleep(3000);

        // Method2
        WebElement username = driver.findElement(By.name("txtU"));
        username.clear();
        username.sendKeys("12003590");

//        driver.findElement(By.className("input_type_pass")).click();
        

       driver.findElement(By.xpath("//*[@id=\"TxtpwdAutoId_8767\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"TxtpwdAutoId_8767\"]")).sendKeys("Ak4shLPU#");

        Thread.sleep(5000);
        driver.findElement(By.id("iBtnLogins")).click();
    }

    public static void main(String[] args) throws Exception {
		ums c= new ums();
		c.chromeLauncher();
	}
}
