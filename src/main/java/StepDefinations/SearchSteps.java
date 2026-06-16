package StepDefinations;
import PAGES.Navbar;
import PAGES.SearchPage;
import Utility.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class SearchSteps extends GWD {

    @Then("Click to a product in search page and navigate to product page")
    public void aa() {
        SearchPage sp = new SearchPage();
        String productUrl = sp.firstItem.getAttribute("href");
        System.out.println("LINK = " + sp.firstItem.getAttribute("href"));

        GWD.getDriver().get(productUrl);

    }
    @When("Enter \"kolsuz tişört \" in search input")
    public void vv() {
        Navbar nb = new Navbar();
        nb.sendKeys(nb.searchInput, "kolsuz tişört", Keys.ENTER);


    }
}
