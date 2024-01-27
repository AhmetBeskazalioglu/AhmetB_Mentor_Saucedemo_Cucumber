package com.saucedemo.step_definitions;

import com.saucedemo.pages.Loginpage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Definitions {

    Loginpage loginpage = new Loginpage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginpage.login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

}
