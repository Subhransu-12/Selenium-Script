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
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class com {
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
@SuppressWarnings("deprecation")
@Test
public void test1() throws Exception {
 driver.get("https://www.trukky.com/door-to-door-goods-delivery");
 driver.manage().window().setSize(new Dimension(1552, 832));
// Thread.sleep(3000);
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// driver.findElement(By.cssSelector(".locationBox:nth-child(1) > .inputField")).click();
 driver.findElement(By.className("inputField")).click();
 driver.findElement(By.cssSelector(".locationBox:nth-child(1) > .inputField")).sendKeys("hyderabad");
 driver.findElement(By.cssSelector("li:nth-child(1) .location")).click();
 Thread.sleep(3000);
 driver.findElement(By.cssSelector(".locationBox:nth-child(2) > .inputField")).click();
 driver.findElement(By.cssSelector(".locationBox:nth-child(2) > .inputField")).sendKeys("delhi");
 driver.findElement(By.cssSelector(".recentSearch li:nth-chilwad(1)")).click();
 driver.findElement(By.cssSelector(".submitBtn")).click();
 driver.findElement(By.cssSelector(".jsx-665002787:nth-child(2) > .serviceDetails")).click();
 driver.findElement(By.cssSelector(".jsx-665002787:nth-child(1) > .serviceDetails")).click();
 driver.findElement(By.cssSelector(".primary")).click();
 driver.findElement(By.cssSelector(".inputBox > .jsx-1905266029:nth-child(2)")).click();
 {
   WebElement dropdown = driver.findElement(By.cssSelector(".inputBox > .jsx-1905266029:nth-child(2)"));
   dropdown.findElement(By.xpath("//option[. = 'Window AC']")).click();
 }
 driver.findElement(By.cssSelector(".inputField")).click();
 driver.findElement(By.cssSelector(".inputField")).sendKeys("2");
 driver.findElement(By.cssSelector(".nextBtn")).click();
 driver.findElement(By.cssSelector(".primary")).click();
 driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
 driver.findElement(By.cssSelector(".react-calendar__navigation__next-button")).click();
 driver.findElement(By.cssSelector(".react-calendar__tile:nth-child(4) > abbr")).click();
 driver.findElement(By.cssSelector(".react-calendar__tile:nth-child(29) > abbr")).click();
 driver.findElement(By.cssSelector(".btn")).click();
 driver.findElement(By.cssSelector(".inputField")).sendKeys("9876543210");
 driver.findElement(By.cssSelector(".btnRow > .btn")).click();
}
}
