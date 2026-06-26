package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.GWD;



public class SearchPage extends HelperFunctions{

    public SearchPage() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    // Element bulma
    @FindBy(xpath = "(//a[@data-product-order='0'])[1]")
    public WebElement FIRST_ITEM;

    @FindBy(css = "h1.product-list-heading__title")
    public WebElement HEADER;

    @FindBy(css = ".not-found-keyword__text")
    public WebElement NOT_FOUND_TEXT;

    @FindBy(css = ".product-description.product-card-info__description")
    public List<WebElement> PRODUCT_NAME;

    @FindBy(css = ".product-brand.product-card-info__brand")
    public List<WebElement> PRODUCT_BRANDS;

    @FindBy(className = "load-more__info-text-viewed-products")
    public WebElement VİEWED_PRODUCT;





}
