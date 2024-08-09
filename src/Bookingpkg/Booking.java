package Bookingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Booking {
	WebDriver driver;
	By close=By.xpath("//*[@id=\"largeModal\"]/div/div/button");
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.id("ToCity");
	By date=By.id("txtFromDate");
	By datetext=By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[2]");
	By day=By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[7]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[2]/div/div/div/div[1]/div/div[3]/button");
	By next=By.xpath("/html/body/div/div[1]/table/thead/tr[1]/th[3]");

	public Booking(WebDriver driver) {
		this.driver=driver;
	}
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(close).click();

	}
	
	public void source(String sourceCity) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(source).sendKeys(sourceCity);
		driver.findElement(source).sendKeys(Keys.ENTER);
	}
	public void destination(String destinationcity) {
		driver.findElement(destination).sendKeys(destinationcity);
		driver.findElement(destination).sendKeys(Keys.ENTER);
	}

	public void datepicker() throws InterruptedException
	{
		String month="August 2024";
		driver.findElement(date).click();
		Thread.sleep(3000);
		
	    while (true) {
	    	String act=driver.findElement(datetext).getText();
	    	if(act.equals(month))
	    	{
	    		break;
	    	}
	    	else
	    		Thread.sleep(2000);
	    		driver.findElement(next).click();
	    }
	    Thread.sleep(2000);
	    driver.findElement(day).click();
	}
	public void search() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(search).click();
	}
	
}
