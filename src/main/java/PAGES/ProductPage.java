package PAGES;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends HelperFunctions {

    public ProductPage() {

        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(css = "button[aria-label='Ürün Açıklaması']")
    public WebElement productDescriptionButton;

    @FindBy(css = ".product-detail-drawer-container")
    public WebElement productDescriptionText;


    @FindBy(xpath = "//button[contains(text(),'Tüm Çerezlere İzin Ver')]")
    public WebElement acceptCookiesButton;

}
