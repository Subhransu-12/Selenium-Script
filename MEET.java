import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MEET {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com");

        // Find the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));

        // Enter the username and password
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        // Click on the login button
        loginButton.click();

        // Wait for a few seconds to see the result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}

