package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Createpage;

public class createpagetest extends Baseclass{


	
	@Test
	public void test2() throws InterruptedException {
		Createpage fb=new Createpage(driver);
		fb.create();
		Thread.sleep(2000);
		fb.login1("abc@gmail.com", "abbb");
		fb.click1();
	}

}
