import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {
    private static WebDriver driver;

    public static void main(String[] args) {

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Navigate to Flipkart
        driver.get("https://www.flipkart.com");

        // Handle pop-up (if any)
        handlePopup();

        // Search for a book
        searchBook("Selenium WebDriver");

        // Click on the first product in the search results
        clickOnProduct();

        // Close the browser
        driver.quit();
    }

    private static void handlePopup() {
        // Example: Handling JavaScript alert
        try {
            driver.switchTo().alert().dismiss();
        } catch (Exception e) {
            // Alert not present, continue with the script
        }
    }

    private static void searchBook(String bookName) {
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.className("L0Z3Pu"));

        // Clear any existing text in the search box
        searchBox.clear();

        // Enter the book name into the search box
        searchBox.sendKeys(bookName);

        // Simulate pressing the "Enter" key
        searchBox.submit();
    }

    private static void clickOnProduct() {
        // Your click code here
        // For example, you might want to click on the first product in the search results
        // WebElement firstProduct = driver.findElement(By.cssSelector("div._4rR01T"));
        // firstProduct.click();
    }
}



