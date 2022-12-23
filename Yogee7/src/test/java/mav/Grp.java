package mav;

import org.testng.annotations.Test;

public class Grp {
	
  @Test(groups = "Smoke",priority = 0)
  public void Test_1() {
	  System.out.println("This is My First Smoke Testing");
  }
  
  @Test(groups = "Regression",priority = 1)
  public void Test_2() {
	  System.out.println("This is My First Regression Testing");
  }
  
  @Test(groups = "Smoke",priority = 2)
  public void Test_3() {
	  System.out.println("This is My Second Smoke Testing");
  }
  
  @Test(groups = "Regression",priority = 3)
  public void Test_4() {
	  System.out.println("This is My Second Smoke Testing");
  }
}
