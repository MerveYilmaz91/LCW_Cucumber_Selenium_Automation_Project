package StepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductPage;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Utility.GWD;


public class ProductPageSteps extends GWD {
    private static final Logger logger = LogManager.getLogger(ProductPageSteps.class);

    ProductPage pp = new ProductPage();

    @Then("User be able to see {string} in the product description")
    public void aa(String arg0) throws InterruptedException {

        ProductPage pp = new ProductPage();

        logger.info("Ürün açıklaması kontrolü başlatıldı");
        GWD.js.executeScript("arguments[0].scrollIntoView(true);", pp.productDescriptionButton);

        logger.info("Ürün açıklaması butonuna scroll yapıldı");
        GWD.js.executeScript("arguments[0].click();", pp.productDescriptionButton);

        logger.info("Ürün açıklaması butonuna tıklandı");

        Thread.sleep(3000);
    }

    @When("User click to add to card button")
    public void userClickToAddToCardButton() {
        ProductPage pp = new ProductPage();

        GWD.js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                pp.ADD_TO_CART_BUTTON);
        GWD.js.executeScript(
                "arguments[0].click();",
                pp.ADD_TO_CART_BUTTON);
        logger.info("Sepete ekle butonuna tıklandı");

    }

    @Then("User able to see \"select a variation\" message")
    public void userAbleToSeeMessage() {
        ProductPage pp = new ProductPage();

        String buttonClass = pp.ADD_TO_CART_BUTTON.getAttribute("class");

        if (buttonClass.contains("add-to-card--select-size")) {
            logger.info("Beden seçilmedi uyarısı göründü");
        } else {
            logger.info("Beden seçilmedi uyarısı görünmedi");
        }

        Assert.assertTrue(buttonClass.contains("add-to-card--select-size"));

    }
}

