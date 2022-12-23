package frame;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Frame1 {
	 WebDriver wd;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		 wd=new ChromeDriver();
		 wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	  }
  @Test(priority = 0)
  public void Login() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys("Admin"); //UserName
		wd.findElement(By.name("password")).sendKeys("admin123");//Password
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();//Login Button
	   }
 @Test(priority = 1)
 public void Pim() throws InterruptedException  
 {
	    Thread.sleep(3000);
		wd.findElement(By.xpath("(//*[@class=\'oxd-text oxd-text--span oxd-main-menu-item--name\'])[2]")).click();//PIM
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--secondary\']")).click();//Add Button
		Thread.sleep(5000);
		wd.findElement(By.name("firstName")).sendKeys("Yogees");//FirstName
		wd.findElement(By.name("middleName")).sendKeys("Waran");//MiddleName
		wd.findElement(By.name("lastName")).sendKeys("J");//LastName
	    wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\']")).click();//Save Button
 }
 @AfterTest
  public void afterTest() {
	  wd.close();
	  
  }

}
