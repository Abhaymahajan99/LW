package com.LawyerWangu.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {




	@FindBy(xpath="//a[.=\"My Account\"]")

	private WebElement MyAccount;


	@FindBy(xpath="//a[.=\"Address Book\"]")

	private WebElement AdrressBook;

	@FindBy(xpath="//a[.=\"Add New Contact\"]")

	private WebElement AddNewContact;
	
	@FindBy(id="name")

	private WebElement Entername;
	
	@FindBy(id="registered_mobile")

	private WebElement registered_mobile;
	
	@FindBy(id="registered_email")

	private WebElement registered_email;
	
	@FindBy(xpath="//label[@ for=\"female\"]")

	private WebElement GenderAsFemale;
	
	@FindBy(xpath="//label[@ for=\"male\"]")

	private WebElement GenderAsMale;






	public MyAccount(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Account()
	{
		MyAccount.click();
		
		AdrressBook.click();
		
		AddNewContact.click();
		
		Entername.sendKeys("Munna bhaiya");
		
		registered_mobile.sendKeys("9804584755484");
		
		registered_email.sendKeys("MunnaBhaiya@gmail.com");
		
		GenderAsMale.click();
		
		
	}

}
