import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hackerrank.com/");
        WebElement logoElement = driver.findElement(By.className("custom-logo"));
        
        // Use assertEquals to check if the logo is displayed
        assertEquals(logoElement.isDisplayed(), "Logo image is not displayed on the page.");
        
        driver.quit();
    }
}

