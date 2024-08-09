package cashonpicktestpkg;

import org.testng.annotations.Test;
import cashonpickpkg.Cashpick;

public class Cashpicktest extends Basecashpick{
	
	@Test
	public void test2() {
		Cashpick cpt=new Cashpick(driver);
		cpt.search("Oneplus");
		cpt.btnclick();
		cpt.advclick();
		cpt.price1("5000");
		cpt.price2("10000");
		cpt.advsrchbtn();
	}

}
