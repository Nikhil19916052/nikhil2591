package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
//All the locater on the page
	@FindBy(xpath=" //*[@name='username']")
	WebElement Username;

	@FindBy(xpath ="//*[@name='password']")
	WebElement Passward;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginbtn;
	@FindBy (xpath="//h5[text()='login']")
	WebElement txtloginpage;

	// Initialize of locators/variables

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// method required to perform test step

	public void loginMethod() {

		Username.sendKeys("Admin");
		Passward.sendKeys("admin123");
		loginbtn.click();
	}

}
