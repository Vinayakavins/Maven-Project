package Stepdefnition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"Stepdefnition"},
plugin = {"pretty","html:target/HtmlReports"}

)
public class Runner {
}
