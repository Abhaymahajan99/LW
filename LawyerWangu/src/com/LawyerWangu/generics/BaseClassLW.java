package com.LawyerWangu.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.LawyerWangu.Pom.Login;
import com.LawyerWangu.Pom.Logout;

public class BaseClassLW {

	public WebDriver driver;
	public JavascriptExecutor js;
	public Filelibrary f = new Filelibrary();
	
	
	  static {
			
			  System.getProperty("webdriver.chrome.driver","/driver/chromedriver");
			  System.getProperty("webdriver.gecko.driver","/driver/geckodriver");
			  System.getProperty("webdriver.edge.driver","/driver/msedgedriver");

	  }
	 
	
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) throws Exception{
		
		String url = f.getPropertyData("url");
		//String browser =f.getPropertyData("browser");
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
		driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firfox")) 
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
			
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    js = (JavascriptExecutor) driver;
		driver.get(url);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod

	  public void login() throws IOException, InterruptedException {
	  
	  
	  String un = f.getPropertyData("username");
	  String pw =f.getPropertyData("password"); 
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
