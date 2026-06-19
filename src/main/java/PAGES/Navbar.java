package PAGES;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Navbar extends HelperFunctions{
    public Navbar(){
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id= "search-form__input-field__search-input")
    public WebElement searchInput;

    public WebElement element;

    @FindBy(css = ".advanced-search")
    public WebElement suggestionBox;

    @FindBy(xpath = "//div[text()='Trend Aramalar']")
    public List<WebElement> trendAramalarText;

    @FindBy(xpath = "//div[text()='Önerilen Aramalar']")
    public List<WebElement> onerilenAramalarText;

    @FindBy(css = ".search-form__input-field__close-wrapper")
    public WebElement clearButton;

    }


