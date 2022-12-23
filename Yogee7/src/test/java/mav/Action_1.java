package mav;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Action_1 {
	 WebDriver driver;
	 public String URL1="https://rahulshettyacademy.com/";
	 @BeforeTest
	  public void beforeTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get(URL1);
			 WebElement br=driver.findElement(By.linkText("More"));
		     Thread.sleep(6000);
			 Actions act =new Actions(driver);
			 act.moveToElement(br).build().perform();  
			 Robot rc=new Robot();
			 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
			 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(6000);
			 rc.keyPress(KeyEvent.VK_PAGE_UP);
			 rc.keyPress(KeyEvent.VK_PAGE_UP);
			 Thread.sleep(3000);
			 WebElement wb=driver.findElement(By.xpath("//*[@href=\'https://courses.rahulshettyacademy.com/courses\']"));
			 act.click(wb).build().perform();
			 WebElement wa=driver.findElement(By.xpath("(//*[@class=\'course-box-image-container\'])[5]"));
			 act.click(wa).build().perform();
			 
			 }
			  
	
  @Test
  public void move() {
	
	  
	  }
  

  @AfterTest
  public void afterTest() {
  }

}
