import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test{
	public void check() {
		ChromeDriver A = new ChromeDriver();
		A.get("https://phptravels.com/demo/");
		
//		A.findElement(By.id("my-text-id")).sendKeys("Subhransu");
//		A.findElement(By.id("my-password")).sendKeys("Subhransu");
//		A.findElement(By.name("my-select")).click();
//		A.findElement(By.id("my-check-1")).click();
//	    A.findElement(By.id("my-check-2")).click();
//	    A.findElement(By.id("my-check-2")).click();
	    
	    
	    String S = A.getTitle();
	    System.out.println("s");
//	    String expected = "Web form";
//	    assertEquals(S, expected);
	}
}