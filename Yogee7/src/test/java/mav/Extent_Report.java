package mav;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver wd;
	@BeforeTest
	  public void Before() {
	  extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/Yogee.html",true);// try to save the html file on test-output
	  extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));// try to load config. on src/test/java
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	
}
@Test
	public void Login() throws InterruptedException {
	logger=extent.startTest("demo");//this indicates that logger will have a influence on the test
	wd.get("https://opensource-demo.orangehrmlive.com/");
	logger.log(LogStatus.PASS, "web page has opened");
	Thread.sleep(3000);//in the report we will have a record of the steps performed

	String title=wd.getTitle(); 
	logger.log(LogStatus.PASS, "Title");
	Thread.sleep(2000);

	Assert.assertEquals("demo", "demo");
	logger.log(LogStatus.PASS, "Assert passed");
	Thread.sleep(2000);

	wd.findElement(By.name("username")).sendKeys("Admin");
	logger.log(LogStatus.PASS, "Username Entered");
	Thread.sleep(2000);

	wd.findElement(By.name("password")).sendKeys("admin123");
	logger.log(LogStatus.PASS, "Password Entered");
	Thread.sleep(2000);

	wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	logger.log(LogStatus.PASS, "Login successfully");
	Thread.sleep(2000);
}
@Test(dependsOnMethods = "Login")
	public void logout() throws InterruptedException {
	wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-img']")).click();
	logger.log(LogStatus.PASS,"DropDown WIll Appear successfully");
	Thread.sleep(2000);

	wd.findElement(By.linkText("Logout")).click();
	logger.log(LogStatus.PASS,"Logout Successfully");
	Thread.sleep(2000);

}
@AfterTest
	public void AT() {
	wd.close();
	
	extent.endTest(logger);// end the logger functions

	extent.flush();//it will flush the all logger data on html report

	extent.close();// it will give end to the reports

}
}
	  

