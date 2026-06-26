package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utility.GWD;

@CucumberOptions(
        features = "src/test/java/",
        glue = "StepDefinations",
        tags = "@Regression"
)

public class RegressionRun extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void beforeClass() {
    }

    @AfterClass
    public void afterClass() {
        GWD.quitDriver();
    }
}
