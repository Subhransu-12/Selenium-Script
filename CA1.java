import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class CA1 {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
public String waitForWindow(int timeout) {
 try {
   Thread.sleep(timeout);
 } catch (InterruptedException e) {
   e.printStackTrace();
 }
 Set<String> whNow = driver.getWindowHandles();
 Set<String> whThen = (Set<String>) vars.get("window_handles");
 if (whNow.size() > whThen.size()) {
   whNow.removeAll(whThen);
 }
 return whNow.iterator().next();
}
@Test
public void test1() {
	//storing value to be searched
 vars.put("toBeSearched", "neckband");
// System.out.print();
 System.out.println("Items to be searched :"+vars.get("toBeSearched").toString());
 driver.get("https://www.ebay.com/");
 vars.put("storedtext", driver.findElement(By.linkText("About eBay")).getText());
 System.out.println(vars.get("storedtext").toString());
 driver.manage().window().setSize(new Dimension(1552, 832));
 js.executeScript("window.scrollTo(0,104.80000305175781)");
// assertThat(driver.getTitle(), is("Electronics, Cars, Fashion, Collectibles & More | eBay"));
 driver.findElement(By.id("gh-ac")).click();
 driver.findElement(By.id("gh-ac")).sendKeys(vars.get("toBeSearched").toString());
 driver.findElement(By.id("gh-btn")).click();
 js.executeScript("window.scrollTo(0,538.4000244140625)");
 vars.put("window_handles", driver.getWindowHandles());
 driver.findElement(By.cssSelector("#item2f8d764c18 .s-item__image-wrapper")).click();
 vars.put("win7145", waitForWindow(2000));
 driver.switchTo().window(vars.get("win7145").toString());
 driver.findElement(By.cssSelector(".x-atc-action .ux-call-to-action__text")).click();
 driver.findElement(By.cssSelector(".btn--large")).click();
 driver.findElement(By.id("gxo-btn")).click();
 js.executeScript("window.scrollTo(0,560.7999877929688)");
 js.executeScript("window.scrollTo(0,560)");
 driver.findElement(By.id("country")).click();
 {
   WebElement dropdown = driver.findElement(By.id("country"));
   dropdown.findElement(By.xpath("//option[. = 'India']")).click();
 }
 driver.findElement(By.id("firstName")).click();
 driver.findElement(By.id("firstName")).sendKeys("Akash");
 driver.findElement(By.id("lastName")).click();
 driver.findElement(By.id("lastName")).sendKeys("Kumar");
 driver.findElement(By.id("addressLine1")).sendKeys("LPU");
 driver.findElement(By.id("addressLine2")).sendKeys("Phagwara");
 driver.findElement(By.id("city")).sendKeys("Phagwara");
 driver.findElement(By.id("stateOrProvince")).click();
 {
   WebElement dropdown = driver.findElement(By.id("stateOrProvince"));
   dropdown.findElement(By.xpath("//option[. = 'Punjab']")).click();
 }
 driver.findElement(By.id("postalCode")).click();
 driver.findElement(By.id("postalCode")).sendKeys("144411");
 driver.findElement(By.id("email")).click();
 driver.findElement(By.id("email")).sendKeys("kittu970980@gmail.com");
 driver.findElement(By.id("emailConfirm")).click();
 driver.findElement(By.id("emailConfirm")).click();
 driver.findElement(By.id("emailConfirm")).sendKeys("kittu970980@gmail.com");
 driver.findElement(By.id("phoneNumber")).click();
 driver.findElement(By.id("phoneNumber")).sendKeys("079798 42902");
 driver.findElement(By.cssSelector(".form-action > .btn")).click();
 js.executeScript("window.scrollTo(0,930.4000244140625)");
}
}