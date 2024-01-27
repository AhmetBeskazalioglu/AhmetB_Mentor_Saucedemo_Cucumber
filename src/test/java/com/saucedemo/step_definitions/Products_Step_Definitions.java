package com.saucedemo.step_definitions;

import com.saucedemo.pages.Loginpage;
import com.saucedemo.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Products_Step_Definitions {

    Loginpage loginpage = new Loginpage();
    ProductsPage productsPage = new ProductsPage();

    @Then("The user verifies the login is successful")
    public void the_user_verifies_the_login_is_successful() {
        loginpage.verifyLogin();
    }

    @When("The user sorts the products by {string}")
    public void the_user_sorts_the_products_by(String string) {
        productsPage.sortProducts(string);
    }

    @When("The user adds the products to cart")
    public void the_user_adds_the_to_cart(List<String> string) {
        productsPage.addToCart(string);
    }

    @Then("The user verifies the products are added to cart")
    public void the_user_verifies_the_products_are_added_to_cart() {
        productsPage.verifyCart();
    }

    @When("The user clicks on the cart icon")
    public void the_user_clicks_on_the_cart_icon() {
        productsPage.clickCartButton();
    }
}
