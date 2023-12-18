

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeLocator {
	WebDriver driver;
	public void locators() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://seleniumbase.io/demo_page");
	}
	public static void main(String[] args) {
		relativeLocator obj= new relativeLocator();
		obj.locators();
	}
}
