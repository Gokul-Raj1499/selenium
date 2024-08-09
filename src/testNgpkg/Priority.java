package testNgpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
	ChromeDriver driver;
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Smoke1");
	}
	@Test(groups = "sanity")
	public void test2() {
		System.out.println("sanity1");
	}
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("smoke2");
	}
	@Test(groups = "sanity")
	public void test4() {
		System.out.println("sanity2");
	}
}
