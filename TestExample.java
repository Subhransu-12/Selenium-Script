import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @Test
    public void testWebForm() {
        WebElement textField = driver.findElement(By.id("my-text-id"));
        textField.sendKeys("Subhransu");

        WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
        checkbox2.click();

        String pageTitle = driver.getTitle();
        String expectedTitle = "Web form";

        assertEquals(expectedTitle, pageTitle);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
