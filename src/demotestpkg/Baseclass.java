package demotestpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}

}
