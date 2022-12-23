package tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		 WebDriver wd=new ChromeDriver();
		 wd.navigate().to("https://demoqa.com/browser-windows");
		 wd.manage().window().maximize();
		// Robot rc=new Robot();
		// Thread.sleep(2000);
		 String Parent=wd.getWindowHandle();
		 System.out.println(Parent);
		// wd.findElement(By.id("tabButton")).click();
		 //Thread.sleep(2000);
		 //rc.keyPress(KeyEvent.VK_CONTROL);
		 //rc.keyPress(KeyEvent.VK_TAB);
		 //Thread.sleep(2000);
		 for(int i=0;i<3;i++)
		 {
		 wd.findElement(By.id("windowButton")).click();
		 Thread.sleep(2000);
		 }
		 Set<String> all=wd.getWindowHandles();
		 System.out.println(all);
		 System.out.println(all.size());
		 String middlewindow="";
		 for(String Handle : all)
			 {
		 wd.switchTo().window(Handle);
		 wd.get("https://www.google.com/");
		 middlewindow = Handle;
		 
			 }
		 Thread.sleep(3000);
		 wd.switchTo().window(Parent);
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         wd.close();
         wd.switchTo().window(middlewindow);
         wd.get("https://mail.google.com/mail/");

		}

}
