package tool;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Element {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		 WebDriver wd=new ChromeDriver();
		 wd.manage().window().maximize();
		/* wd.navigate().to("https://demoqa.com/");//Open ToolQA
		 Thread.sleep(2000);
		 Robot rc=new Robot();
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
         WebElement a=wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]"));//Elements
         Actions act =new Actions(wd);
		 act.click(a).build().perform();
		 //TextBox
		 Thread.sleep(2000);
		 WebElement b=wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[1]"));//TextBox
		 act.click(b).build().perform();
		 wd.findElement(By.id("userName")).sendKeys("Yogeeswaran");//Username
		 wd.findElement(By.id("userEmail")).sendKeys("yoyogeshrockzz@gmail.com");//Useremail
		 wd.findElement(By.id("currentAddress")).sendKeys("6/10,Sivakasi");//Current Address
		 wd.findElement(By.id("permanentAddress")).sendKeys("6/10,Sivakasi");//PermanentAddress
		 Thread.sleep(2000);
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@class=\'btn btn-primary\']")).click();//SubmitButton
		 
		 
		 //CheckBox
		 rc.keyPress(KeyEvent.VK_PAGE_UP);
		 Thread.sleep(2000);
		 WebElement c=wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[2]"));//CheckBox
		 act.click(c).build().perform();
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-uncheck\"]")).click();
		 
		 //RadioButton
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[3]")).click();//RadioButtpn
		 Thread.sleep(1000);
		 wd.findElement(By.xpath("(//*[@class=\"custom-control-label\"])[1]")).click();
		 Thread.sleep(1000);
		 wd.findElement(By.xpath("(//*[@class=\"custom-control-label\"])[2]")).click();
		 
		 //WebTables
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[4]")).click();//WebTables
		 Thread.sleep(1000);
		 wd.findElement(By.id("addNewRecordButton")).click();//Add
		 Thread.sleep(1000);
		 wd.findElement(By.id("firstName")).sendKeys("Yogeeswaran");//Username
		 wd.findElement(By.id("lastName")).sendKeys("j");//Lastname
		 wd.findElement(By.id("userEmail")).sendKeys("yoyogeshrockzz@gmail.com");//Useremail
		 wd.findElement(By.id("age")).sendKeys("21");//Age
		 wd.findElement(By.id("salary")).sendKeys("0");//Salary
		 wd.findElement(By.id("department")).sendKeys("CSE");//Department
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("(//*[@class=\"btn btn-primary\"])[2]")).click();//Submit
		 Thread.sleep(1000);
		 wd.findElement(By.id("searchBox")).sendKeys("Yogee");//Search Box
		 Thread.sleep(1000);
		 wd.findElement(By.xpath("(//*[@class=\'rt-tr -odd\']/div[7]/div/span[2])")).click();//Delete Button
		
		 
		 //Buttons
		 Thread.sleep(2000);
		 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[5]")).click();//Button
		 Thread.sleep(1000);
		 WebElement b1= wd.findElement(By.id("doubleClickBtn"));//Double Click
		 act.doubleClick(b1).build().perform();
		 Thread.sleep(2000);
		 WebElement b2=wd.findElement(By.id("rightClickBtn"));//Right Click
		 act.contextClick(b2).build().perform();
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@class=\"col-12 mt-4 col-md-6\"]/div[2]/div[3]/button")).click();//click
		
		  
		  //Link
		  rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[6]")).click();//Button
		  Thread.sleep(1000);
		  wd.findElement(By.id("simpleLink")).click();//Link 1
		  Thread.sleep(1000);
		  wd.findElement(By.id("dynamicLink")).click();//Link 2
		  Thread.sleep(4000);
		  rc.keyPress(KeyEvent.VK_CONTROL);
		  rc.keyPress(KeyEvent.VK_TAB);
		  */
		  
		  //Upload|Download
		  wd.navigate().to("https://demoqa.com/upload-download");
		  Thread.sleep(3000);
		  wd.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\LENOVO\\Pictures\\Saved Pictures\\wp4066901.jpg");
		 
		}
	
	
}
