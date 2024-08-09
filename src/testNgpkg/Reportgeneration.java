package testNgpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration {
	WebDriver driver;
	ExtentHtmlReporter extent;
	ExtentReports report;
	ExtentTest test;
	@BeforeMethod
	public void setup() {
		driver.get("https://www.facebook.com/");
		
	}
	@BeforeTest
	public void beforetest() {
		driver=new ChromeDriver();
		extent=new ExtentHtmlReporter("./Reports/myreport.html");
		extent.config().setTheme(Theme.STANDARD);
		extent.config().setReportName("Automation Report");
		extent.config().setDocumentTitle("myreport");
		report=new ExtentReports();
		report.attachReporter(extent);
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("host","general");
	
	}
	@Test
	public void test1() {
		
		test=report.createTest("test1");
		String exp="Facebook – log in or sign up";
		String actual=driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, exp);
		
	}
	
	@Test
	public void test2() {
		test=report.createTest("test2");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Abc@123");
		driver.findElement(By.name("login")).click();
		
		
	}
	@AfterTest
	public void aftertest() {
		report.flush();
	}

}
