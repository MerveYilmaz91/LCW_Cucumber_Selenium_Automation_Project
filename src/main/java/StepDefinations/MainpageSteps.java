package StepDefinations;

import PAGES.MainPage;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainpageSteps {
    @Given("User navigates to main page")
    public void bb() {

        GWD.getDriver().get("https://www.lcwaikiki.com");

        MainPage mp = new MainPage();
        mp.cookiesAcceptButton.click();

    }
}
