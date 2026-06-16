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
        sp.firstItem.click();


    }
    @When("Enter \"kolsuz gömlek\" in search input")
    public void vv() {
        Navbar nb = new Navbar();
        nb.searchInput.sendKeys("Kolsuz Gömlek", Keys.ENTER);

    }
}
