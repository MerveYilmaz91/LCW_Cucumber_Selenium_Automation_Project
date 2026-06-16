package StepDefinations;
import PAGES.ProductPage;
import io.cucumber.java.en.Then;
import Utility.GWD;
import org.testng.Assert;


public class ProductPageSteps extends GWD {

    ProductPage pp = new ProductPage();

    @Then("User be able to see \"kolsuz\" and \"tişört\" in the product description")
    public void aa() {

        String description = pp.productDetailsMiddle.getText();

        Assert.assertTrue(
                description.toLowerCase().contains("kolsuz") &&
                        description.toLowerCase().contains("tişört"),
                "Ürün açıklamasında kelimeler bulunamadı");
        }
    }

