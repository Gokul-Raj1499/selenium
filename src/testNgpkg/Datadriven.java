package testNgpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
	@BeforeTest
	public void fb() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test() throws IOException {
		FileInputStream ob=new FileInputStream("C:\\Users\\Dell\\Documents//user.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh+"555555");
		int rowcount=sh.getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username="+username);
			System.out.println("Password="+password);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		}
	}

}
