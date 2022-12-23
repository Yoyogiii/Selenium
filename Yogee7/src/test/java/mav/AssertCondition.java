package mav;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AssertCondition {
  @Test(priority = 0)
  public void Yogee() {
	  AssertJUnit.assertEquals("adithya","adithya");
	  System.out.println("This Is Main Case");
  }
  @Test(priority = 1,dependsOnMethods = "Yogee")
  public void Pratiksha() {
	 
	  System.out.println("This Is First Case");
  }
  @Test(priority = 2,dependsOnMethods = "Yogee")
  public void Meghna() {
	 
	  System.out.println("This Is Second Case");
  }
  @Test(priority = 3)
  public void Prashanth() {
	  
	  System.out.println("This Is Third Case");
  }
}
