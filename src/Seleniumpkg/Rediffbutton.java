package Seleniumpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffbutton {
	ChromeDriver driver;
	
	@Before
	public void Setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void Test() {
		WebElement Bt = driver.findElement(By.className("btn_checkavail"));
		String exp="Check availability";
		
		String actual=Bt.getAttribute("value");
		System.out.println(actual);
		if(actual==exp) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	@After
	public void close() {
		
	}

}
