package testNgpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerautomation {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://phptravels.net/");
		
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.id("checkin")).click();
		String exp="December 2024";
		
		while(true) {
			String actual=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]")).getText();
driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[6]/div[1]/table/tbody/tr[5]/td[4]")).click();
	if(actual.equals(exp)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		}
	}

}
