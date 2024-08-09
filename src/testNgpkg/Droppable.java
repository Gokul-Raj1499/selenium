package testNgpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Droppable {
	
	ChromeDriver driver;
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethod() {
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test() {
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act = new Actions(driver);
        act.dragAndDrop(dragme, drophere);
        act.perform();
        driver.manage().window().maximize();
        WebElement dropped=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        String actual=dropped.getText();
        String exp="Dropped!";
        if(actual.equals(exp)) {
        	System.out.println("Pass");
        }
        else {
        	System.out.println("Fail");
        }
	}
	@AfterMethod
	public void aftermethod() {
		
	}
	@AfterTest
	public void aftertest()
	{
		
	}
	

}
