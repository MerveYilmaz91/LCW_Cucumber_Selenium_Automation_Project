package StepDefinations;
import PAGES.Navbar;
import PAGES.SearchPage;
import Utility.GWD;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;


public class SearchSteps extends GWD {

    SearchPage sp = new SearchPage();
    Navbar nb = new Navbar();

    @Then("Click to a product in search page and navigate to product page")
    public void aa() {
        String productUrl = sp.firstItem.getAttribute("href");
        System.out.println("LINK = " + sp.firstItem.getAttribute("href"));
        GWD.getDriver().get(productUrl);

    }

    @When("Enter \"ko\" in search input user shouldn't see the autocomplete box")
    public void vv() {
        nb.clickElement(nb.searchInput);
        nb.sendKeys(nb.searchInput, "ko");
        if (!nb.trendAramalarText.isEmpty()) {
            Assert.fail();
        }
    }

    @When("Enter kot in search input user should see the autocomplete box")
    public void enterInSearchInputUserShouldSeeTheAutocompleteBox() throws InterruptedException {
        nb.clickElement(nb.searchInput);
        nb.searchInput.clear();
        nb.sendKeys(nb.searchInput, "kot");

        Thread.sleep(2000);

        if (!nb.onerilenAramalarText.isEmpty()) {
            Assert.fail();
        }
    }
}
