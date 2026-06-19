package StepDefinations;
import PAGES.Navbar;
import PAGES.SearchPage;
import Utility.GWD;
import io.cucumber.java.PendingException;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.function.FailableObjDoubleConsumer;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;

import java.util.List;


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
        Assert.assertTrue(nb.trendAramalarText.isEmpty());

    }

    @When("Enter kot in search input user should see the autocomplete box")
    public void enterInSearchInputUserShouldSeeTheAutocompleteBox() throws InterruptedException {

    }

    @When("Enter {string} in search input and search")
    public void enterInSearchInputAndSearch(String arg0) {
        nb.sendKeys(nb.searchInput, arg0, Keys.ENTER);
    }

    @And("User must see the search page with {string} header")
    public void userMustSeeTheSearchPageWithHeader(String arg0) {
        sp.header.getText();
        Assert.assertTrue(sp.header.getText().contains(arg0));

    }

    @Then("User must see the no found page with {string}")
    public void userMustSeeTheNoFoundPageWith(String arg0) {
        Assert.assertTrue(sp.notFoundText.getText().contains(arg0));
    }

    @Then("User must see {string} in products 10 at least")
    public void userMustSeeInProductsAtLeast(String arg0) {
        int i = 0;
        for (WebElement element : sp.productNames) {
            if (element.getText().toLowerCase().contains(arg0)) {
                i++;
            }
            if (i == 10) {
                break;
            }
        }
        System.out.println(i);
        if (!(i == 10)) {
            Assert.fail();
        }
    }

    @Then("User shouldn't see the autocomplete box")
    public void userShouldnTSeeTheAutocompleteBox() {
        nb.clickElement(nb.searchInput);
        nb.searchInput.clear();
        nb.sendKeys(nb.searchInput, "kot");

        if (!nb.onerilenAramalarText.isEmpty()) {
            Assert.fail();
        }
    }

    @When("Enter {string} in search input")
    public void enterInSearchInput(String arg0) {
        nb.sendKeys(nb.searchInput,arg0);
    }

    @And("User clicks clear button")
    public void userClicksClearButton() {
        nb.searchInput.sendKeys(Keys.CONTROL + "a");
        nb.searchInput.sendKeys(Keys.BACK_SPACE);
    }

    @Then("Search input should be empty")
    public void searchInputShouldBeEmpty() {
        Assert.assertEquals(nb.searchInput.getAttribute("value"),"");
    }

    @Then("User must see {string} brand in product 10 at least")
    public void userMustSeeBrandInProductAtLeast(String brandName) {
        int count = 0;
        for (WebElement brand : sp.productBrands) {
            if (brand.getText().equalsIgnoreCase(brandName)) {
                count++;
            }
            if (count == 10) {
                break;
            }
        }
        System.out.println("Brand Count = " + count);
        Assert.assertTrue(count >= 10);
    }

    @And("Enter words in search input and search")
    public void enterWordsInSearchInputAndSearch(DataTable table) {

        List<List<String>> data = table.asLists();

        String searchText = data.get(1).get(0) + " " + data.get(1).get(1);

        nb.sendKeys(nb.searchInput, searchText, Keys.ENTER);
    }

    @Then("User must see searched words in url")
    public void userMustSeeSearchedWordsInUrl(DataTable table) {
        List<List<String>> data = table.asLists();

        String currentUrl = GWD.getDriver().getCurrentUrl();

        for (String word : data.get(1)) {
            Assert.assertTrue(
                    currentUrl.toLowerCase().contains(word.toLowerCase()));
        }
    }
}


