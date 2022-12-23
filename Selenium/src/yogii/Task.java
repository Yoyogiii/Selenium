package yogii;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task {
public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();
			wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(3000); // Loading website for seconds
			wd.findElement(By.name("username")).sendKeys("Admin"); //UserName
			wd.findElement(By.name("password")).sendKeys("admin123");//Password
			wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();//Login Button
			Thread.sleep(5000);
			wd.findElement(By.xpath("(//*[@class=\'oxd-text oxd-text--span oxd-main-menu-item--name\'])[2]")).click();//PIM
			Thread.sleep(5000);
			wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--secondary\']")).click();//Add Button
			Thread.sleep(5000);
			wd.findElement(By.name("firstName")).sendKeys("Yogees");//FirstName
			wd.findElement(By.name("middleName")).sendKeys("Waran");//MiddleName
			wd.findElement(By.name("lastName")).sendKeys("J");//LastName
		    wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\']")).click();//Save Button
		    Thread.sleep(5000);
		    wd.findElement(By.xpath("(//*[@class=\'oxd-input oxd-input--active\'])[2]")).sendKeys("Yogii");//NickName
		    wd.findElement(By.xpath("(//*[@class=\'oxd-input oxd-input--active\'])[3]")).sendKeys("76");//Other ID
		    wd.findElement(By.xpath("(//*[@class=\'oxd-input oxd-input--active\'])[4]")).sendKeys("07062001");//License
		    wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-calendar oxd-date-input-icon\']"));
		    }
}