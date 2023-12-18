package CA1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CA1TestExample {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
    }

    @Test
    public void testWebForm() {
        WebElement textField1 = driver.findElement(By.name("first_name"));
        textField1.sendKeys("Subhransu Sekhar");
        
        WebElement textField2 = driver.findElement(By.name("last_name"));
        textField2.sendKeys("Satapathy");     
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
