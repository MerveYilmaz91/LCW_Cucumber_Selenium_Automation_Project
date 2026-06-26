package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NavbarRun extends AbstractTestNGCucumberTests {
        public static void main(String[] args) throws Throwable {
                Logger.getLogger("").setLevel(Level.SEVERE);

                String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
                System.setProperty("logFileName","src/test/Logs/Automation-Logs-" + timestamp + ".log");

                String[] cucumberOptions = {
                        "classpath:features",
                        "--glue", "StepDefinitions",
                        "--tags","@navbar"
                };
                io.cucumber.core.cli.Main.run(cucumberOptions, Thread.currentThread().getContextClassLoader());
        }

        @BeforeSuite
        public void beforeSuite(){
                String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
                System.setProperty("logFilePath","src/test/Logs/Automation-Logs-" + timestamp + ".log");
        }
}
