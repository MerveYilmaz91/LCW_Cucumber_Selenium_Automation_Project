package StepDefinations;
import io.cucumber.java.en.Then;

import static Utility.GWD.driver;

public class ProductPageSteps {
    @Then("User be able to see \"kolsuz\" and \"gömlek\" in the product description")
    public void aa() {
        driver.get("https://lcwaikiki.com");
    }
}
