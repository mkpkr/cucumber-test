package mike.kafka.restproducer;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary"}, monochrome = true, snippets = SnippetType.CAMELCASE)
public class RunCucumberTest {
	
}