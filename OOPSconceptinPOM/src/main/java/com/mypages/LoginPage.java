package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	private By username = By.xpath("//*[@id=app]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	private By Pasward = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	private By LoginBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	private By Header = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// getters
	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return getElement(username);
	}

	/**
	 * @return the pasward
	 */
	public WebElement getPasward() {
		return getElement(Pasward);
	}

	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return getElement(LoginBtn);
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(Header);
	}
public String getLoginPageTitle() {
	return getPageTitle();
	}
public String getLoginPageHeader() {
	 return getPageHeader(Header);
} 
public HomePage doLogin (String username, String pasward) {
	getUsername().sendKeys(username);
	getPasward().sendKeys(pasward);
	getLoginBtn().click();
	return  getInstance(HomePage.class);
}
public void doLogin() {
	getUsername().sendKeys();
	getPasward().sendKeys();
	getLoginBtn().click();
}
public HomePage doLogin(String userCred) {
	if(userCred.contains("username")) {
		getUsername().sendKeys(userCred.split(":")[1].trim());
	}
	else if (userCred.contains("Pasward")) {
		getUsername().sendKeys(userCred.split(":")[1].trim());
	}
	getLoginBtn().click();
	return null;
}
}
