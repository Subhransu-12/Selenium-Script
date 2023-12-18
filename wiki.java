import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class wiki {
WebDriver driver;

public void browser() {
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.wikipedia.org/");
System.out.println("This is the title: "+ driver.getTitle());
driver.findElement(By.id("searchInput")).sendKeys("ISRO");
//driver.findElement(By.id("myButton")).click();
driver.findElement(By.xpath("//button")).click();


}


public static void main(String[] args) {
wiki obj = new wiki();
obj.browser();



}

}
