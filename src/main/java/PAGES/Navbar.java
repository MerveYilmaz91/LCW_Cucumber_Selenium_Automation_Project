package PAGES;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navbar extends HelperFunctions{
    public Navbar(){
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id= "search-form__input-field__search-input")
    public WebElement searchInput;

    public WebElement element;

}
