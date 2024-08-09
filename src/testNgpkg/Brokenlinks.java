package testNgpkg;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Brokenlinks {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethod() {
		driver.get("https://www.resume.com/");}
	@Test
	public void test() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());
		 
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                checkBrokenLink(url);
	            }       }
	}
	  public void checkBrokenLink(String linkUrl) {
	        try {
	            URL url = new URL(linkUrl);
	            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	            httpURLConnection.setConnectTimeout(3000);
	            httpURLConnection.connect();
	            if (httpURLConnection.getResponseCode() >= 400) {
	                System.out.println(linkUrl + " --- " + httpURLConnection.getResponseMessage() + " - " + httpURLConnection.getResponseCode());
	            }

	            else {
	            }
	        } catch (IOException e) {
	            System.out.println(linkUrl + " --- " + e.getMessage());
	        }
	    }
	  
	  @AfterTest
	  public void aftertest() {
//		  driver.close();
	  }
	  
	  
	  

}
