package StepDefinations;
import PAGES.ProductPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import Utility.GWD;
import org.openqa.selenium.By;
import org.testng.Assert;


public class ProductPageSteps extends GWD {

    ProductPage pp = new ProductPage();

    @Then("User be able to see {string} in the product description")
    public void aa(String arg0) throws InterruptedException {

        pp.clickElement(pp.acceptCookiesButton);

        GWD.js.executeScript("arguments[0].scrollIntoView(true);", pp.productDescriptionButton);
        GWD.js.executeScript("arguments[0].click();", pp.productDescriptionButton);

        Thread.sleep(3000);
    }

}

