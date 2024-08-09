package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniummclass {

	public static void main(String[] args) {
		ChromeDriver fd=new ChromeDriver();
//		EdgeDriver ed=new EdgeDriver();
//		FirefoxDriver fd=new FirefoxDriver();
		fd.get("https://www.facebook.com/");
		fd.findElement(By.name("email")).sendKeys("abc@gmail.com");
		fd.findElement(By.id("pass")).sendKeys("Arjun@123");
		fd.findElement(By.name("login")).click();

	}

}
