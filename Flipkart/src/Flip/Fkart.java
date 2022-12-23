package Flip;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Fkart {
	 WebDriver wd;
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			 wd=new ChromeDriver();
			 wd.navigate().to("https://www.flipkart.com/");
	  }
	
  @Test(priority = 0)
  public void Login() throws InterruptedException {
	 // wd.findElement(By.xpath("//*[@class=\'\']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'_2KpZ6l _2doB4z\']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'_1_3w1N\']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'_2IX_2- VJZDxU\']")).sendKeys("9360949081");
	  wd.findElement(By.xpath("//*[@class=\'_2IX_2- _3mctLh VJZDxU\']")).sendKeys("8248739335");
	  wd.findElement(By.xpath("//*[@class=\'_2KpZ6l _2HKlqd _3AWRsL\']")).click();
	  }
  @Test(priority = 1)
  public void Search() throws InterruptedException {
  Thread.sleep(3000);
  wd.findElement(By.xpath("//*[@class=\'_3704LK\']")).click();
  wd.findElement(By.xpath("//*[@class=\'_3704LK\']")).sendKeys("ball");
  wd.findElement(By.xpath("//*[@class=\'L0Z3Pu\']")).click();
	  }
  @Test(priority = 2)
  public void Ball() throws InterruptedException {
  Thread.sleep(6000);
  wd.findElement(By.xpath("//*[@class=\'_396cs4\']")).click();
  Thread.sleep(3000);
  wd.findElement(By.xpath("//*[@class=\'_2KpZ6l _2U9uOA ihZ75k _3AWRsL\']")).click();
  }
 // @Test
  //public void Buy_Now() throws InterruptedException {
  //Thread.sleep(3000);
  //wd.findElement(By.xpath("//*[@class=\'\']")).click();
  
//_1P2-0f new address
  @AfterTest
  public void afterTest() {
  }

}
