package PAGES;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends HelperFunctions {

    public ProductPage() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = ".product-description product-card-info__description")
    public WebElement productDetailsMiddle;

    @FindBy(xpath = "//*[contains(text(),'Ürün Açıklaması')]")
    public WebElement mainDescriptionButton;

}
