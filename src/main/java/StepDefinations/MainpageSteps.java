package StepDefinations;

import pages.MainPage;

import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Utility.GWD;

public class MainpageSteps {

    static int i;

    private static final Logger logger = LogManager.getLogger(MainpageSteps.class);


    @Given("User navigates to main page")
    public void bb() {
        logger.info("Kullanıcı ana sayfaya yönlendirildi");
        GWD.getDriver().get("https://www.lcwaikiki.com");
        logger.info("Kullanıcı ana sayfaya geldi");

        MainPage mp = new MainPage();

    }

    @Given("User navigates to website")
    public void userNavigatesToWebsite() {
        logger.info("Kullanıcı ana sayfaya yönlendirildi");
        GWD.getDriver().get("https://www.lcwaikiki.com");
        logger.info("Kullanıcı ana sayfaya geldi");

        MainPage mp = new MainPage();

        if (i != 1) {
            mp.clickElement(mp.cookiesAcceptButton);
            logger.info("Kullanıcı cookieleri kabul etti");

            mp.clickElement(mp.closeNotificationButton);
            logger.info("Kullanıcı notificationları kapattı");

            i++;
        }
    }
}
