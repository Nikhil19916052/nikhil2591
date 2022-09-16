package com.Mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

public class BaseTest {
WebDriver driver;
public Page page;
@BeforeMethod
@Parameters(value= {"Browser"})
public void setUpTest(String brower) throws InterruptedException {
	if(brower.equals("Chrome")) {
	System.setProperty("WebDriver.chrome.driver", "C:\\webdriverchrom\\chromedriver.exe");
	WebDriver	driver=new ChromeDriver();
			}
	else {
		System.out.println("brower is defined in xml format");
	}
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
page = new BasePage(driver);
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}
