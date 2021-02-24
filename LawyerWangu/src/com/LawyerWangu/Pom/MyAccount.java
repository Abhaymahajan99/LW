package com.LawyerWangu.Pom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


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

	@FindBy(id="dob")

	private WebElement DOB;

	@FindBy(id="identity")
	

	private WebElement DropDownPassport;

	@FindBy(id="passport")

	private WebElement EnterpassportNo;
	
	
	

	@FindBy(xpath="//input[@id=\"countries\"]")

	private WebElement EnteCountryAddress;

	@FindBy(xpath="//input[@id=\"po_box\"]")

	private WebElement EntePostBoxAddress;

	@FindBy(xpath="//input[@id=\"postal_code\"]")

	private WebElement EntePostalAddress;


	private JavascriptExecutor driver;
	
	


	@FindBy(xpath="//span[@id=\"submit_sub_details\"]")

	private WebElement SaveDetails;

	
	@FindBy(xpath="(//button [.=\"Remove\"])[1]")

	private WebElement RemoveContect;
	
	@FindBy(id="remove-details")

	private WebElement RemoveDetailsYes;
	

	@FindBy(id="modal_dismiss")

	private WebElement ModalDismissNo;
	
	
	
	
	
	




	public MyAccount(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void Details()
	{
		MyAccount.click();

		AdrressBook.click();

		AddNewContact.click();

		Entername.sendKeys("Munna bhaiya");

		registered_mobile.sendKeys("9804584755484");

		registered_email.sendKeys("MunnaBhaiya@gmail.com");

		GenderAsMale.click();

		DOB.sendKeys("08-11-1995");
		DOB.click();

		DropDownPassport.click();
	} 
	
	public void Passport() throws InterruptedException 
	{ 
		Select s=new Select(DropDownPassport); 
		s.selectByValue("Passport");
		EnterpassportNo.sendKeys("658259655");
		Thread.sleep(2000);
	}



	public void Address() throws InterruptedException {
		
		
		
		Thread.sleep(2000);
		EnteCountryAddress.sendKeys("Kenya");
		EntePostBoxAddress.sendKeys("123Box");
		EntePostalAddress.sendKeys("90118 Ndalani");
		Thread.sleep(2000);

	}

	
	public void Save() throws InterruptedException {
		
		
		Thread.sleep(2000);
		SaveDetails.click();
	}
	
	
	
	public void removecontect() throws InterruptedException {
		
	
		Thread.sleep(2000);
		RemoveContect.click();
		//RemoveDetailsYes.click();
		 ModalDismissNo.click();
		
		
		Thread.sleep(2000);
		
		
	}
}
