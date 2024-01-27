package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void login(String username, String password) {
        userName.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

    public void verifyLogin() {
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }
}
