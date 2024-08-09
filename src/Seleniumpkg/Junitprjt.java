package Seleniumpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprjt {
	ChromeDriver fd;
	@Before
	public void setup() {
		fd=new ChromeDriver();
		fd.get("https://www.facebook.com/");
		
		
		}
	
	@Test
	public void Testing() {
		String exp="Facebook – log in or sign up";
		String actual=fd.getTitle();
		System.out.println(actual);
		if(exp.equals(actual)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	@After
	public void Aftesting() {
		fd.quit();
	}
	

}
