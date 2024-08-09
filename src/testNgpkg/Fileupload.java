package testNgpkg;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
ChromeDriver driver;
@BeforeTest
public void beforetest() {
	driver=new ChromeDriver();
}
@Test
public void url() throws AWTException, InterruptedException
{	driver.get("https://demo.guru99.com/test/upload/");
	WebElement button=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	button.click();
//	fileupload("\"C:\\Users\\Dell\\Desktop\\pgm1.docs\"");
}

//public void fileupload(String p) throws AWTException, InterruptedException {
//	 StringSelection stringSelection = new StringSelection(p);
//       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//
//       // Use Robot class to simulate keyboard actions
//       Thread.sleep(2000);
//       Robot robot = new Robot();
//       robot.keyPress(KeyEvent.VK_CONTROL);
//       robot.keyPress(KeyEvent.VK_V);
//       robot.keyRelease(KeyEvent.VK_CONTROL);
//       robot.keyRelease(KeyEvent.VK_V);
//       Thread.sleep(2000);
//       robot.keyPress(KeyEvent.VK_ENTER);
//       robot.keyRelease(KeyEvent.VK_ENTER);
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//button[@id=\"processTask\"]")).click();
//       
//       
//}
}
