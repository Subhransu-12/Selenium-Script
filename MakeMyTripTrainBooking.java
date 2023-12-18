import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripTrainBooking {

    public static void main(String[] args) {

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to MakeMyTrip website
        driver.get("https://www.makemytrip.com/");

        // Find and click on the "Flights" tab
        WebElement flightsTab = driver.findElement(By.xpath("//a[@data-cy='menu_Flights']"));
        flightsTab.click();

        // Find and enter the source city in the "From" field
        WebElement fromCity = driver.findElement(By.id("fromCity"));
        fromCity.sendKeys("Delhi");

        // Find and enter the destination city in the "To" field
        WebElement toCity = driver.findElement(By.id("toCity"));
        toCity.sendKeys("Mumbai");

        // Find and click on the "Search" button
        WebElement searchButton = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
        searchButton.click();

        // Close the browser
        driver.quit();
    }
}

