package Seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Titleselector {

	public static void main(String[] args) {
		ChromeDriver fd=new ChromeDriver();
		fd.get("https://www.facebook.com/");
		String exp="Facebook – log in or sign up55";
		String actual=fd.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, exp);
//		if(exp.equals(actual)) {
//			System.out.println("Passed");
//		}
//		else {
//			System.out.println("Failed");
//		}
//
//	}

//		fd.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
//		String exp="LinkedIn";
//		String actual=fd.getTitle();
//		if(actual.contains(exp)) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("Failed");
//		}
		
}
}
