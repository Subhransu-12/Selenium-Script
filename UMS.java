import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UMS {
    private WebDriver driver;

    public void automateWebForm() {
        driver = new ChromeDriver();
        driver.get("https://lpulive.lpu.in/login");

        WebElement textField1 = driver.findElement(By.id("inputEmail"));
        textField1.sendKeys("Subhransu Sekhar");

        WebElement textField2 = driver.findElement(By.id("inputPassword"));
        textField2.sendKeys("Satapathy");
        
        driver.findElement(By.className("btn-next")).click();


    }

    public static void main(String[] args) {
        UMS umsTest = new UMS();
        umsTest.automateWebForm();

    }
}
