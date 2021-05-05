package locator;

import org.openqa.selenium.By;

public interface Locators {
    String url = "https://opencart.abstracta.us/index.php?route=account/login";
    By emailInput = By.cssSelector("#input-email");
    By passInput = By.cssSelector("#input-password");
    By loginButton = By.cssSelector("input.btn.btn-primary");
    By logineditCntrl = By.xpath("(//a[text()='Edit Account'])[1]");
    By loginCheck = By.cssSelector("href");
    By searchArena = By.cssSelector("input.form-control.input-lg");
    By searchButton = By.cssSelector("i.fa.fa-search");
    By macAddCart = By.cssSelector("button>i.fa.fa-shopping-cart");
    By priceTotal = By.cssSelector("#cart-total");
    By viewCard = By.cssSelector("strong>i.fa.fa-shopping-cart");

    By inShoppingCart = By.cssSelector("td.text-right");
}
