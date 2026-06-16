package StepDefinations;
import io.cucumber.java.en.Then;
import Utility.GWD;

public class ProductPageSteps {

    GWD gwd = new GWD();

    @Then("User be able to see \"kolsuz\" and \"gömlek\" in the product description")
    public void aa() {

        System.out.println("son adım");
    }
}
