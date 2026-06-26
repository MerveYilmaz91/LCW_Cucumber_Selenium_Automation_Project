package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.GWD;

public class MainPage extends HelperFunctions {


    public MainPage(){
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id= "cookieseal-banner-accept")
    public WebElement cookiesAcceptButton;

    @FindBy(className= "ins-web-opt-in-reminder-close-button")
    public WebElement closeNotificationButton;



}
