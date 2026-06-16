package PAGES;

import Utility.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends HelperFunctions{

    public SearchPage() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    // Element bulma
    @FindBy(xpath = "(//a[@data-product-order='0'])[1]")
    public WebElement firstItem;



}
