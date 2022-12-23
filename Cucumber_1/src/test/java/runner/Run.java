package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/Login.feature"},glue={"definition"},dryRun = true)
public class Run extends AbstractTestNGCucumberTests{

}
