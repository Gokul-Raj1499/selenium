package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fblogin;


public class Fbloginpgm extends Baseclass{
	

	
	@Test
	public void test1() {
		Fblogin fb=new Fblogin(driver);
		fb.login("abc@gmail.com", "abbb");
		fb.click();
	}
	

}
