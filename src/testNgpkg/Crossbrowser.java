package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void before(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
		}
		else
		{
			 driver=new FirefoxDriver();
		}
	}
	@Test
	public void test() {
		driver.get("https://www.google.com/");
	}
	@Test
	public void test1() {
		driver.get("https://www.google.com/");
		WebElement searchbtn=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		String actual=searchbtn.getAttribute("value");
		System.out.println(searchbtn);
		String exp="Google Search";
		if(actual.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	}
	

}
