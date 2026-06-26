package StepDefinations;

import pages.Navbar;
import pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Utility.GWD;

import java.util.List;


public class SearchSteps extends GWD {
    private static final Logger logger =
            LogManager.getLogger(SearchSteps.class);


    SearchPage sp = new SearchPage();
    Navbar nb = new Navbar();

    @Then("Click to a product in search page and navigate to product page")
    public void aa() {
        String productUrl = sp.FIRST_ITEM.getAttribute("href");
        logger.info("Ürün sayfasına gidiliyor : " + productUrl);
        GWD.getDriver().get(productUrl);

    }

    @When("Enter \"ko\" in search input user shouldn't see the autocomplete box")
    public void vv() {
        nb.clickElement(nb.SEARCH_INPUT);
        nb.sendKeys(nb.SEARCH_INPUT, "ko");
        Assert.assertTrue(nb.TREND_ARAMALAR_TEXT.isEmpty());

    }

    @When("Enter kot in search input user should see the autocomplete box")
    public void enterInSearchInputUserShouldSeeTheAutocompleteBox() throws InterruptedException {

    }

    @When("Enter {string} in search input and search")
    public void enterInSearchInputAndSearch(String arg0) {
        logger.info("Aranan ürün : " + arg0);
        nb.sendKeys(nb.SEARCH_INPUT, arg0, Keys.ENTER);
    }

    @And("User must see the search page with {string} header")
    public void userMustSeeTheSearchPageWithHeader(String arg0) {
        logger.info("Header kontrol ediliyor : " + arg0);
        sp.HEADER.getText();
        Assert.assertTrue(sp.HEADER.getText().contains(arg0));

    }

    @Then("User must see the no found page with {string}")
    public void userMustSeeTheNoFoundPageWith(String arg0) {
        logger.info("404 sayfası kontrol ediliyor");
        Assert.assertTrue(sp.NOT_FOUND_TEXT.getText().contains(arg0));
    }

    @Then("User must see {string} in products 10 at least")
    public void userMustSeeInProductsAtLeast(String arg0) {
        int i = 0;
        for (WebElement element : sp.PRODUCT_NAME) {
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
        nb.clickElement(nb.SEARCH_INPUT);
        nb.SEARCH_INPUT.clear();
        nb.sendKeys(nb.SEARCH_INPUT, "kot");

        if (!nb.ONERILEN_ARAMALAR_TEXT.isEmpty()) {
            Assert.fail();
        }
    }

    @When("Enter {string} in search input")
    public void enterInSearchInput(String arg0) {
        nb.sendKeys(nb.SEARCH_INPUT,arg0);
    }

    @And("User clicks clear button")
    public void userClicksClearButton() {
        nb.SEARCH_INPUT.sendKeys(Keys.CONTROL + "a");
        nb.SEARCH_INPUT.sendKeys(Keys.BACK_SPACE);
    }

    @Then("Search input should be empty")
    public void searchInputShouldBeEmpty() {
        Assert.assertEquals(nb.SEARCH_INPUT.getAttribute("value"),"");
    }

    @Then("User must see {string} brand in product 10 at least")
    public void userMustSeeBrandInProductAtLeast(String brandName) {
        int count = 0;
        for (WebElement brand : sp.PRODUCT_BRANDS) {
            if (brand.getText().equalsIgnoreCase(brandName)) {
                count++;
            }
            if (count == 10) {
                break;
            }
        }
        logger.info("Bulunan marka sayısı : " + count);
        Assert.assertTrue(count >= 10);
    }

    @And("Enter words in search input and search")
    public void enterWordsInSearchInputAndSearch(DataTable table) {

        List<List<String>> data = table.asLists();

        String searchText = data.get(1).get(0) + " " + data.get(1).get(1);

        nb.sendKeys(nb.SEARCH_INPUT, searchText, Keys.ENTER);
    }

    @Then("User must see searched words in url")
    public void userMustSeeSearchedWordsInUrl(DataTable table) {
        List<List<String>> data = table.asLists();

        String currentUrl = GWD.getDriver().getCurrentUrl();
        logger.info("URL kontrol ediliyor : " + currentUrl);

        for (String word : data.get(1)) {
            Assert.assertTrue(
                    currentUrl.toLowerCase().contains(word.toLowerCase()));
        }
    }

    @And("Click to search button")
    public void clickToSearchButton() {
        logger.info("Search butonuna tıklandı");
        nb.clickElement(nb.SEARCH_BUTTON);
    }

    @Then("Product size must be same with search page info")
    public void productSizeMustBeSameWithSearchPageInfo() {
        int actualSize = sp.PRODUCT_NAME.size();

        int expectedSize = Integer.parseInt(sp.VİEWED_PRODUCT.getText());

        logger.info("Actual Size = " + actualSize);
        logger.info("Expected Size = " + expectedSize);

        Assert.assertEquals(actualSize, expectedSize);

    }
}


