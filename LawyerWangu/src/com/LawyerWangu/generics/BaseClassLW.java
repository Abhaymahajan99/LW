package com.LawyerWangu.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.LawyerWangu.Pom.Login;
import com.LawyerWangu.Pom.Logout;

public class BaseClassLW {

	public WebDriver driver;
	public Filelibrary f = new Filelibrary();

	String os = System.getProperty("os.name").toLowerCase();


	@BeforeTest
	public void openBrowser() throws IOException {
		
		String url = f.getPropertyData("url");
		
		driver=new ChromeDriver();
		
		if(os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",("user.dir")+"/driver/chromedriver");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException {

		
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		Login l=new Login(driver);
		l.setLogin(un,pw);
		
		Thread.sleep(4000);
		 
	}

	@AfterMethod
	public void logout() {
		Logout lg=new Logout(driver);
		lg.Setlogout();

	}
}
