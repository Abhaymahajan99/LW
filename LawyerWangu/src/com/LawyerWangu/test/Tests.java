package com.LawyerWangu.test;



import org.testng.annotations.Test;

import com.LawyerWangu.Pom.MyAccount;
import com.LawyerWangu.Pom.Personal;
import com.LawyerWangu.generics.BaseClassLW;


public class Tests extends BaseClassLW {
	
	@Test

	public void test() throws Exception   {
		
		MyAccount m=new MyAccount(driver);
		
		m.Account();
		
		Thread.sleep(500);
		
		
		
		
		
		/*
		 * Personal p=new Personal(driver); Thread.sleep(4000); p.Affidavit();
		 * Thread.sleep(200); p.Companys_Doc(); Thread.sleep(200); p.DiscardPage();
		 */
	}


}
