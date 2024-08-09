package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
	
	WebDriver driver;
	By email=By.id("email");
	By password=By.id("pass");
	By loginbutton=By.name("login");
	By create=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	
	public Createpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  void create() {
		driver.findElement(create).click();
	}
	
	public void login1(String email1,String passwrd) {
		driver.findElement(email).sendKeys(email1);
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void click1() {
		driver.findElement(loginbutton).click();
	}

}
