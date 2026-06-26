package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.GWD;
import org.jspecify.annotations.Nullable;

public class ProductPage extends HelperFunctions {


    public ProductPage() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "button.product-detail-drawer__button[aria-label='Ürün Açıklaması']")
    public WebElement productDescriptionButton;

    @FindBy(css = ".product-detail-drawer__content")
    public WebElement productDescriptionText;

    @FindBy(xpath = "//button[contains(text(),'Tüm Çerezlere İzin Ver')]")
    public WebElement acceptCookiesButton;

    @FindBy(css = "button.add-to-card")
    public WebElement ADD_TO_CART_BUTTON;

}
