package cashonpicktestpkg;

import org.testng.annotations.Test;
import cashonpickpkg.Cahonpick;

public class Cashonpicktest extends Basecashpick{
	
	@Test
	public void test1() {
		Cahonpick cp=new Cahonpick(driver);
		cp.search("Samsung");
		cp.btnclick();
		cp.sortdropdwn("Name: A to Z");
		cp.displaydropdwn("9");
	}

}
