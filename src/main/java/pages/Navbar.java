package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.GWD;

import java.util.List;

public class Navbar extends HelperFunctions{
    public Navbar(){
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id= "search-form__input-field__search-input")
    public WebElement SEARCH_INPUT;

    public WebElement element;

    @FindBy(css = ".advanced-search")
    public WebElement SUGGESTION_BOX;

    @FindBy(xpath = "//div[text()='Trend Aramalar']")
    public List<WebElement> TREND_ARAMALAR_TEXT;

    @FindBy(xpath = "//div[text()='Önerilen Aramalar']")
    public List<WebElement> ONERILEN_ARAMALAR_TEXT;

    @FindBy(css = ".search-form__input-field__close-wrapper")
    public WebElement CLEAR_BUTTON;

    @FindBy(className = "search-form__input-field__btn-search")
    public WebElement SEARCH_BUTTON;



    }


