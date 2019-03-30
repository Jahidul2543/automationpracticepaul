package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.HomePage;
import objects.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginUsingDataTableStepDefinitions extends ApplicationPageBase {

    HomePage objHomePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage objLoginPage = PageFactory.initElements(driver, LoginPage.class);

    @Given("^User is in login page$")
    public void user_is_in_login_page(){
        objHomePage.getLogInPage();


    }

    @When("^Enter invalid email and password from Data Table$")
    public void enter_invalid_email_and_password_from_Data_Table(DataTable table)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<Map<String, String>> datatable = table.asMaps(String.class,String.class);

        objLoginPage.login(datatable.get(1).get("userName"),datatable.get(1).get("password"));


    }

    @Then("^Error message appear$")
    public void error_message_appear(){
        String actualText = objLoginPage.getErroMessage();
        Assert.assertEquals(actualText, "Authentication failed.");

    }

}
