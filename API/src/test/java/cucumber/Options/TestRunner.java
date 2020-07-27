package cucumber.Options;




import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features="src/test/java/features/DogBreed.feature", glue={"stepsDefinition"})
public class TestRunner extends AbstractTestNGCucumberTests {

	
	
	
}
