package tool;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Widget {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver wd=new ChromeDriver();
		 wd.manage().window().maximize();
		 Robot rc=new Robot();
		 Actions act=new Actions(wd);
		 
		 
	/*	 //Accordian
		 wd.navigate().to("https://demoqa.com/accordian");
		 Thread.sleep(2000);
		 wd.findElement(By.id("section1Heading")).click();
		 Thread.sleep(2000);
		 wd.findElement(By.id("section3Heading")).click();*/
		 
		 
		 //Auto-Complete
		
		 wd.navigate().to("https://demoqa.com/auto-complete");
		 Thread.sleep(5000);
        WebElement a= wd.findElement(By.xpath("//*[@class=\'auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3\']"));
        a.sendKeys("R");
        // wd.findElement(By.xpath("//*[@class=\'auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3\']")).
         
         
         
		/* wd.navigate().to("https://demoqa.com/slider");
		 Thread.sleep(2000);
		 WebElement slider = wd.findElement(By.xpath("//*[@class=\'range-slider range-slider--primary\']"));
		 Thread.sleep(2000);
		   Actions act1 = (Actions) act.dragAndDropBy(slider,25,50).build();
		  //  ((Actions) act1).perform();*/
	}

	
}