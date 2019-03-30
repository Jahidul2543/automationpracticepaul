package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.HomePage;
import objects.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginStepDefinitions extends ApplicationPageBase {

    HomePage objHomePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage objLoginPage = PageFactory.initElements(driver, LoginPage.class);


    @Given("^User is in sign in page$")
    public void user_is_in_sign_in_page(){
      objHomePage.getLogInPage();

    }

    @When("^Users uses incorrect \"([^\"]*)\" and \"([^\"]*)\"$")
    public void users_uses_incorrect_and(String arg1, String arg2){
    objLoginPage.login(arg1, arg2);

    }

    @Then("^Unable to log in and error message should be displayed$")
    public void unable_to_log_in_and_error_message_should_be_displayed(){

        String actualText = objLoginPage.getErroMessage();
        Assert.assertEquals(actualText, "Authentication failed.");

    }

}
