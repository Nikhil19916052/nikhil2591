package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.LoginPage;
import mainjava.PimPage;

public class BaseTest {
	public static WebDriver driver;
	protected LoginPage loginpage;
	protected PimPage pimPage;

	@BeforeClass
	public void launchBrouser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		// Thread.sleep(9000);
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().getImplicitWaitTimeout();

	}

	@BeforeClass
	public void Pageobject() {
		loginpage = new LoginPage(driver);
		// pimPage = new PimPage(driver);
	}

	@AfterClass
	public void tearDownEnvironment() {
		//driver.quit();
	}
}
