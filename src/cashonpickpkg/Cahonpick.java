package cashonpickpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Cahonpick {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"auto-searchterms1\"]");
	By srchbtn=By.xpath("//*[@id=\"small-search-box-form1\"]/button");
	By sortByDropdown = By.xpath("//*[@id=\"products-orderby\"]");
	By displaydrpdown = By.xpath("//*[@id=\"products-pagesize\"]");
	public Cahonpick(WebDriver driver) {
		this.driver=driver;
	}
	public void search(String value) {
		driver.findElement(search).sendKeys(value);
	}
	public void btnclick() {
		driver.findElement(srchbtn).click();
	}
	public void sortdropdwn(String visibleText) {
		WebElement dropdownElement = driver.findElement(sortByDropdown);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
	}
	public void displaydropdwn(String visibleText) {
		WebElement displayElement = driver.findElement(displaydrpdown);
        Select displaydrop = new Select(displayElement);
        displaydrop.selectByVisibleText(visibleText);
	}
}

