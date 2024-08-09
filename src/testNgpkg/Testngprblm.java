package testNgpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprblm {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
		
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		driver.get("https://www.linkedin.com/login");
	}
	@Test
	public void test1() {
		WebElement title = driver.findElement(By.xpath("//*[@id=\"app__container\"]/header/a/li-icon"));
		String actual=title.getAttribute("alt");		
		String exp="LinkedIn";
		if(exp.equals(actual)) {
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
		
	}
	@Test
	public void test2() {
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("No: of links= "+li.size());
		
		 for (WebElement link : li) {
	            String href = link.getAttribute("href");
	            System.out.println("-------" + href);
	        }
	}
	@AfterMethod
	public void aftermethod() {
		
	}
	
   @AfterTest
   public void aftertest() {
	   
   }

}
