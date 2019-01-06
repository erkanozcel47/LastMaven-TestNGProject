package com.erk.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erk.utilities.Driver;

public class Page  {
	
	public Page() {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	@FindBy(xpath="//.[@name='sscscs']")
	public WebElement username;
	
	@FindBy(xpath="//.[@name='sscscs']")
	public WebElement username2;
	
	@FindBy(xpath="//.[@name='sscscs']")
	public WebElement username3;

}
