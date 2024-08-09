package Seleniumpkg;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksautomation {
	ChromeDriver driver;
	int count;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void test() {
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("No: of links= "+li.size());
		
		 for (WebElement link : li) {
	            String href = link.getAttribute("href");
	            System.out.println("-------" + href);
	        }
	}
	@After
	public void after() {
	driver.close();
	}
}
