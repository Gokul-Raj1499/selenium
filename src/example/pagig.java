package example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pagig {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
	}
	@Test
	public void test() throws IOException {
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select select = new Select(drop);
//		select.selectByIndex(5);
		select.selectByVisibleText("Algeria");
		File drp=drop.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(drp,new File("C:\\Users\\Dell\\Desktop\\Testing ss\\ss6.png"));
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\Dell\\Desktop\\Testing ss\\ss5.png"));
	}
}
