package co.com.dafiti.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/datiti.feature",
        glue = {"co.com.dafiti"})
        //tags = "@this")
public class DafitiRunner {

}
