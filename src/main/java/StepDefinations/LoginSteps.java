package StepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginSteps  {
    private static final Logger logger =
            LogManager.getLogger(LoginSteps.class);

    @Then("^User click to login button$")
    public void userClickToLoginButton() {
        logger.info("Kullanıcı giriş butonuna tıkladı");

    }

    @When("^User redirect to login page and User enter valid credentials$")
    public void userRedirectToLoginPageAndUserEnterValidCredentials() {
        logger.info("Kullanıcı login sayfasına yönlendirildi");
        logger.info("Geçerli kullanıcı bilgileri girildi");

    }

    @Then("^User be able to login seccesfully$")
    public void userBeAbleToLoginSeccesfully() {
        logger.info("Kullanıcı başarıyla giriş yaptı");

    }
}
