package cashonpickpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cashpick {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"auto-searchterms1\"]");
	By srchbtn=By.xpath("//*[@id=\"small-search-box-form1\"]/button");
	By advsearch=By.name("adv");
	By price1=By.id("pf");
	By price2=By.id("pt");
	By advsrchbtn=By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/div[2]/div[1]/form/div[2]/input");
	public Cashpick(WebDriver driver) {
		this.driver=driver;
	}
	public void search(String value) {
		driver.findElement(search).sendKeys(value);
	}
	public void btnclick() {
		driver.findElement(srchbtn).click();
	}
	public void advclick() {
		driver.findElement(advsearch).click();
	}
	public void price1(String price11) {
		driver.findElement(price1).sendKeys(price11);
	}
	public void price2(String price22) {
		driver.findElement(price2).sendKeys(price22);
	}
	public void advsrchbtn() {
		driver.findElement(advsrchbtn).click();
	}
	}
