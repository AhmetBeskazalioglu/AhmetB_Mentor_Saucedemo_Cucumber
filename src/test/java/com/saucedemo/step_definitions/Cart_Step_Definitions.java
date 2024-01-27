package com.saucedemo.step_definitions;

import com.saucedemo.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Cart_Step_Definitions {

CartPage cartPage = new CartPage();

    @Then("The user verifies the added products are displayed in the cart")
    public void the_user_verifies_the_added_are_displayed_in_the_cart(List<String> string) {
        cartPage.verifyTheAddedProducts(string);
    }
    @When("The user clicks on the checkout button and fills the form")
    public void the_user_clicks_on_the_checkout_button_and_fills_the_form() {
        cartPage.clickCheckoutButton();
        cartPage.fillTheForm();
    }
    @When("The user clicks on the continue button and clicks on the finish button")
    public void the_user_clicks_on_the_continue_button_and_clicks_on_the_finish_button() {
        cartPage.clickContinueButton();
        cartPage.clickFinishButton();
    }
    @Then("The user verifies the order is placed successfully")
    public void the_user_verifies_the_order_is_placed_successfully() {
        cartPage.verifyOrderCompleted();
    }
}
