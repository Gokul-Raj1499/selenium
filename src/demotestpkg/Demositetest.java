package demotestpkg;
import java.awt.AWTException;
import org.testng.annotations.Test;
import demopkg.Demosite;

public class Demositetest extends Baseclass {
	@Test
	public void test1() throws InterruptedException, AWTException{  
		Demosite obj=new Demosite(driver);
		obj.inputvalues("gokul", "raj", "jjd po", "gokul@gmail.com", "7896786545", "Adobe InDesign", "oggf", "oggf");
		obj.refresh();
	}
}