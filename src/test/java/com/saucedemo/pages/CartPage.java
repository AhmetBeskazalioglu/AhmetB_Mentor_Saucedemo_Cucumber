package com.saucedemo.pages;

import com.github.javafaker.Faker;
import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    ProductsPage productsPage = new ProductsPage();

    Faker faker = new Faker();

    // checkout button
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "finish")
    public WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']")
    public WebElement orderCompletedMessage;

    @FindBy(css = ".inventory_item_name")
    public List<WebElement> itemName;

    public void verifyTheAddedProducts(List<String> string) {
        for (int i = 0; i < string.size(); i++) {
            Assert.assertEquals(string.get(i), itemName.get(i).getText());
        }
    }

    public void clickCheckoutButton() {
        BrowserUtils.scrollToElement(checkoutButton);
        checkoutButton.click();
    }

    public void fillTheForm() {
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        postalCode.sendKeys(faker.address().zipCode());
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickFinishButton() {
        finishButton.click();
    }

    public void verifyOrderCompleted() {
        String expected = "Thank you for your order!";
        String actual = orderCompletedMessage.getText();
        Assert.assertEquals(expected, actual);
    }


}
