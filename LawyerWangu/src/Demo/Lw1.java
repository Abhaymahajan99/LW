package Demo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lw1 {
	
	static {

		  System.getProperty("webdriver.edge.driver","./driver/msedgedriver");
	}
	

public static void main(String[] args) throws InterruptedException {
	

		
		WebDriver driver=new EdgeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		
		driver.get("https://phpstack-309053-945841.cloudwaysapps.com/");
		
		
		/*
		 * driver.findElement(By.id("cn-accept-cookie")).click();
		 * 
		 * driver.findElement(By.xpath("//a[@title=\"Log In\"]")).click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.
		 * xpath("//a[@class='btn btn-lg btn-google btn-block text-uppercase fb-btn']"))
		 * .click();
		 * 
		 * driver.findElement(By.id("email")).sendKeys("lawyer_lfedlez_2@tfbnw.net");
		 * 
		 * driver.findElement(By.id("pass")).sendKeys("testuser@123");
		 * 
		 * driver.findElement(By.id("loginbutton")).click();
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * 
		 * 
		 * 
		 * String etitle = "My Account - Lawyer Wangu"; String atitle =
		 * driver.getTitle(); System.out.println("Title name : "+atitle);
		 * 
		 * 
		 * Assert.assertEquals(etitle, atitle);
		 */
			driver.close();
			
			

}}
