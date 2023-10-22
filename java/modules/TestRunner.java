package modules;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	
	        features = "src/test/resources/Features",
	        // we need to execute the annotations before and after in modules/hooks 
	        glue= {"modules","stepDefinitions"},
	        monochrome= true,	       
	        plugin= {"json:target/cucumber.json"},
	        tags= ""
		)

public class TestRunner {

}
