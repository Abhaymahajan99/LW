package com.LawyerWangu.test;



import org.testng.Assert;

import org.testng.annotations.Test;

import com.LawyerWangu.Pom.MyAccount;

import com.LawyerWangu.generics.BaseClassLW;


public class Tests extends BaseClassLW {

	@Test
	public void test() throws Exception   {
		
		Thread.sleep(500);
		
		MyAccount m= new MyAccount(driver);
		
		m.Details();
		Thread.sleep(500);
		m.Passport();
		Thread.sleep(2000);
		m.Address();
		Thread.sleep(2000);
		
		 
		
		js.executeScript("window.scrollBy(0,-500)");
		
     
        m.Save();
   
        
		m.removecontect();
			 	
	
	}
}
