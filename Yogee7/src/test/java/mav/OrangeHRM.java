package mav;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRM {
	WebDriver wd;
	
	
	@BeforeTest
	  public void beforeTest() throws AWTException {
		WebDriverManager.chromedriver().setup();
		wd =new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	
	
  @Test(priority = 0)
  public void Login() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys("Admin"); //UserName
		wd.findElement(By.name("password")).sendKeys("admin123");//Password
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();//Login Button
  }
  @Test(priority = 1)
  public void Admin() throws InterruptedException {
	  Thread.sleep(3000);
		wd.findElement(By.xpath("(//*[@class=\'oxd-text oxd-text--span oxd-main-menu-item--name\'])[1]")).click();//Admin
	
		 Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class=\'oxd-select-text-input\']")).sendKeys("ESS");
		 
		
  }
  

  @AfterTest
  public void afterTest() {
  }

}
