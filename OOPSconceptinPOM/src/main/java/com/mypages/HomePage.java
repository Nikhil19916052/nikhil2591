package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
private By header= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"); 
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the header
	 */
	public By getHeader() {
		return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(By header) {
		this.header = header;
	}
	

}
