package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import mainjava.PimPage;

public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void verifylogin() {
		loginpage.loginMethod();
	//	AssertJUnit.assertEquals(pimPage.titleofpage(), "PIM");

	}
}
