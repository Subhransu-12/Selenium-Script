import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInAutomation {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
        loginToLinkedIn("shubhransusekhar12@gmail.com", "Bapun@12");
        searchConnection("John Doe");
        driver.quit();
    }
    private static void loginToLinkedIn(String email, String password) {
        WebElement emailField = driver.findElement(By.id("session_key"));
        WebElement passwordField = driver.findElement(By.id("session_password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    private static void searchConnection(String connectionName) {
        WebElement searchBox = driver.findElement(By.cssSelector("input[role='combobox']"));
        searchBox.sendKeys(connectionName);

        WebElement searchButton = driver.findElement(By.cssSelector("button[aria-label='Search']"));
        searchButton.click();
    }
}

