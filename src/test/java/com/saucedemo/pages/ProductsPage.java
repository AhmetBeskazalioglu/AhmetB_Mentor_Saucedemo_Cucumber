package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsPage extends BasePage{

    public static int sum;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortBy;

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    public List<WebElement> itemName;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement cartProductsCount;

    @FindBy(css = ".shopping_cart_link")
    public WebElement cartButton;


    public void sortProducts(String sortType){
        Select select = new Select(sortBy);
        select.selectByVisibleText(sortType);
    }

    public void addToCart(List<String> itemNames){
        for (String itemName : itemNames) {
            String xpath = "//div[@class='inventory_item_name ' and text()='"+itemName+"']//following::button[1]";
            WebElement addToCartButton = Driver.get().findElement(By.xpath(xpath));
            BrowserUtils.clickWithJS(addToCartButton);
            BrowserUtils.waitFor(1);
            sum++;
        }
    }

    public void verifyCart(){
        BrowserUtils.waitFor(2);
        String cartCount = cartProductsCount.getText();
        Assert.assertEquals(String.valueOf(sum),cartCount);
    }

    public void clickCartButton(){
        cartButton.click();
    }

}
