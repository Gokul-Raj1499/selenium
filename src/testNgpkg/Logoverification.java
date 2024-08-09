package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logoverification {
	WebDriver driver;
	@BeforeMethod
	public void before() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test() {
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		if(logo.isDisplayed()) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		
	}
	

}
