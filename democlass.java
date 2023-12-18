import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class democlass {
WebDriver driver;

public void demofunction() {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://seleniumbase.io/demo_page");
System.out.println(driver.getTitle());
driver.findElement(By.id("myTextInput")).sendKeys("Demo test");
driver.findElement(By.xpath("//*[@id=\"myTextarea\"]")).sendKeys("this is the demo test");
driver.findElement(By.xpath("//*[@id=\"myTextInput2\"]")).clear();
driver.findElement(By.xpath("//*[@id=\"myTextInput2\"]")).sendKeys("new text");
System.out.println("Before clicking the button: " + driver.findElement(By.xpath("//*[@id=\"pText\"]")).getText());
driver.findElement(By.xpath("//*[@id=\"myButton\"]")).click();
System.out.println("After clicking the button: " +driver.findElement(By.xpath("//*[@id=\"pText\"]")).getText());
//driver.quit();
}

public static void main(String arg[]) {
democlass demo_t = new democlass();
demo_t.demofunction();
}
}