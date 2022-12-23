package tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alt {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demoqa.com/alertsWindows");
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	    Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[2]")).click();
        Thread.sleep(2000);
        wd.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        Alert alter=wd.switchTo().alert();
        System.out.println(alter.getText());
        Thread.sleep(2000);
        alter.accept();
        
        //Timer Alert
        Thread.sleep(3000);
        wd.findElement(By.id("timerAlertButton")).click();
       // wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebDriverWait wt=new WebDriverWait(wd,180);
        wt.until(ExpectedConditions.alertIsPresent());
        Alert alter1=wd.switchTo().alert();
        System.out.println(alter1.getText());
        Thread.sleep(2000);
        alter1.accept();
        
        //Confirm
        Thread.sleep(2000);
        wd.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        Alert alter2=wd.switchTo().alert();
        System.out.println(alter2.getText());
        Thread.sleep(2000);
        alter2.accept();
        
        //Prompt
        Thread.sleep(2000);
        wd.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert alter3=wd.switchTo().alert();
        System.out.println(alter3.getText());
        Thread.sleep(2000);
        alter3.sendKeys("Hiii");
        alter3.accept();
	}
	
}
