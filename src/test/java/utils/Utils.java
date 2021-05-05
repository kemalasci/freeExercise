package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.reporters.jq.Main;

import static com.codeborne.selenide.Selenide.$$;

public class Utils {

    public int stringToTotal(ElementsCollection priceList) {
        int priceTotal = 0;
        for (SelenideElement price :$$(priceList)) {
            int intPrice = Integer.parseInt(price.getText().replaceAll("'[^\\d.]'", ""));
            priceTotal += intPrice;
        }
        System.out.println("Total Rechnung= " + priceTotal);
        return priceTotal;
    }

    public static void main(String[] args) {
        String str = "a12.334tyz.78x";
        str = str.replaceAll("[^\\d.]", "");
        System.out.println(str);
    }

}
