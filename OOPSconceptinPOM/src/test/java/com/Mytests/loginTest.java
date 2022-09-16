package com.Mytests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class loginTest extends BaseTest{
@Test (priority=1)
public void verifyloginpagetitletest() {
	String title= page.getInstance(LoginPage.class).getLoginPageTitle();
	System.out.println("title");
	Assert.assertEquals(title, "OrangeHRM");
		}
@Test (priority=2)
public void verifyloginpageheader() {
	String header = page.getInstance(LoginPage.class).getLoginPageHeader();
	System.out.println("header");
	Assert.assertEquals(header, "PIM");
}
@Test(priority=3)
public void doLoginTest() {
	HomePage homepage= page.getInstance(LoginPage.class).doLogin("Admin","admin123");
	String headerHome= homepage.getPageHeader(null);
	
	
	
}

}
