package stepDefinetions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Locators;
import org.testng.Assert;
import utils.Utils;

import static com.codeborne.selenide.Selenide.*;

public class OpenCartStepdefs extends Utils implements Locators {


    @Given("Open the openCart web page")
    public void openTheOpenCartWebPage() {
        open(url);

    }

    @When("Check login status")
    public void checkLoginStatus() {
        $(emailInput).sendKeys("kayitkayiticin@gmail.com");
        $(passInput).sendKeys("12345");
        $(loginButton).click();
        $(logineditCntrl).shouldHave(Condition.text("Edit Account"));
        for (SelenideElement element : $$(loginCheck)) {
            Boolean a = element.getText().contains("Wish List");
            if (a == true) {
                break;
            } else continue;


        }
        sleep(3000);

    }

    @Then("^Search Mac and add to card$")
    public void searchMacAndAddToCard() {
        $(searchArena).sendKeys("mac");
        $(searchButton).click();
        for (int i = 0; i < $$(macAddCart).size(); i++) {
            $$(macAddCart).get(i).scrollTo().shouldBe(Condition.appear).click();
        }


        sleep(2000);
    }

    @And("total product and price control")
    public void totalProductAndPriceControl() {

        Double doublePriceTotal = Double.parseDouble($(priceTotal).getText().replaceAll("[^\\d.]", "").substring(2));
        System.out.println(doublePriceTotal);
        $(priceTotal).click();
        $(viewCard).click();
        sleep(2000);

        int index = $$(inShoppingCart).size();
        Double inShopingCartTotal = Double.parseDouble($$(inShoppingCart).get(index - 1).getText().replaceAll("[^\\d.]", ""));
        System.out.println(inShopingCartTotal);
        sleep(2000);
        Assert.assertEquals(doublePriceTotal, inShopingCartTotal);
    }
}
