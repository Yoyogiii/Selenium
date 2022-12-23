package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Definition {
	WebDriver wd;
	
	@Given("User Should In the Login Page")
	public void user_should_in_the_login_page() {
		WebDriverManager.chromedriver().setup();
		wd =new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	   
	}
	
	@When("Enter The Valid UserName {string}")
	public void enter_the_valid_user_name(String string) throws InterruptedException {		
		Thread.sleep(1000);
		wd.findElement(By.name("username")).sendKeys(string);	   
	}
	
	@When("Enter the VAlid Password  {string}")
	public void enter_the_v_alid_password(String string) {
		 wd.findElement(By.name("password")).sendKeys(string);
	}
	
	@When("Click ON Login button")
	public void click_on_login_button() {
		  wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();		  
	}
	
	@Then("I Should Get the Title  {string}")
	public void i_should_get_the_title(String string) {
		Assert.assertEquals(wd.getTitle(),string);	  
	}

}
