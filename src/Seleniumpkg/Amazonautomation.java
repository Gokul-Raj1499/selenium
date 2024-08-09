package Seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonautomation {
	ChromeDriver driver;

	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void Testing(){
		driver=new ChromeDriver();
		driver.findElement(By.id("pass")).sendKeys("Arjun@123");
	}
	

}
