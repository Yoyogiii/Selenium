package mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Orange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String act=driver.getTitle();
		System.out.println(act);
		String exp="OrangeHRM";
		Assert.assertEquals(act, exp);
		WebElement ab=driver.findElement(By.xpath("*//[@class=\'oxd-input oxd-input--active\']"));
		Assert.assertEquals(true,ab.isDisplayed());
		System.out.println("Assertion Passed");
		driver.quit();
		

	}

}
