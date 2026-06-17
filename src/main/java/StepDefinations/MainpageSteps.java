package StepDefinations;

import PAGES.MainPage;
import Utility.GWD;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainpageSteps {


    @Given("User navigates to main page")
    public void bb() {
        GWD.getDriver().get("https://www.lcwaikiki.com");

    }

    @Given("User navigates to website")
    public void userNavigatesToWebsite() {
        GWD.getDriver().get("https://www.lcwaikiki.com");
        MainPage mp = new MainPage();
        mp.clickElement(mp.cookiesAcceptButton);
        mp.clickElement(mp.closeNotificationButton);
    }
}
