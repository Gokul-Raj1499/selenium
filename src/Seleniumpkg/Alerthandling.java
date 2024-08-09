package Seleniumpkg;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alerthandling {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/alert_example.html");
	}
	@Test
	public void test() throws IOException {
		driver.findElement(By.xpath("//*[@value=\"Display alert box\"]")).click();
		Alert s =driver.switchTo().alert();
		s.accept();
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("xyz");
		String actual=driver.findElement(By.xpath("//*[@value=\"Submit\"]")).getAttribute("value");
		String exp="Submit";
		driver.findElement(By.xpath("//*[@value=\"Submit\"]")).click();
		if(exp.equals(actual)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Fail");
		}
	
		 WebElement alertButton = driver.findElement(By.xpath("//*[@value=\"Display alert box\"]"));
		 // Take screenshot of the specific element (alert button)
	        File src = alertButton.getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(src, new File("C:\\Users\\Dell\\Desktop\\Testing ss\\ss5_alert_button.png"));
	        
		
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("C:\\Users\\Dell\\Desktop\\Testing ss\\ss51.png"));
		
		
	}
	@After
	public void after() {
		
	}
	

}
