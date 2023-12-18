import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hackerrank.com/");
        WebElement logoElement = driver.findElement(By.className("custom-logo"));
        if (logoElement.isDisplayed()) {
            System.out.println("Logo image is displayed on the page.");
            logoElement.click();
        } else {
            System.out.println("Logo image is not displayed on the page.");
        }
    }
}

