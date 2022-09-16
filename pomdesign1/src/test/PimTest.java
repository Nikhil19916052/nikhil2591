package test;

import org.testng.annotations.BeforeMethod;

public class PimTest extends BaseTest {
@BeforeMethod
public void login()
	{
		loginpage.loginMethod();
	}
}
