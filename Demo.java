import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = new JUnitCore().runClasses(JUnit4.class);
		for(Failure fail : result.getFailures()) {
			System.out.print(fail.toString());
		}
		System.out.print("Result == " + result.wasSuccessful());
//	    System.out.println(S);
//	    if(expected.equals(S)) {
//	    	System.out.print(true);
//	    }else{
//	    	System.out.print(false);
//	    }
	}
	
	
}



