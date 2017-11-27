package Page;

import Execute.Main;
import org.omg.CORBA.MARSHAL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderPayment {
    public static void payByBankWire() {
        //Log
        System.out.println("Choosing Pay by bank wire option");
        //Page Element
        WebElement btn = Main.driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
        //Action
        btn.click();
    }

    public static void payByCheck() {
        //Log
        System.out.println("Choosing Pay by check option");
        //Page Element
        WebElement btn = Main.driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
        //Action
        btn.click();
    }
//TODO - CANT LOCATE PRICE WITHOUT TAX
    public static void printOrderSummary() {
        //Log
        System.out.println("Getting order price..");
        //Page Element
        WebElement products = Main.driver.findElement(By.id("total_product"));
        WebElement shipping = Main.driver.findElement(By.id("total_shipping"));
//        WebElement totalWithoutTax = Main.driver.findElement(By.id("total_price_without_tax"));
        WebElement tax = Main.driver.findElement(By.id("total_tax"));
        WebElement totalWithTax = Main.driver.findElement(By.id("total_price"));
        //Action
        System.out.println("Order summary: \n Total Products: " + products.getText() +
                "\n Total Shipping: " + shipping.getText() +
//                "\n Total without Tax: " + totalWithoutTax.getText() +
                "\n Tax: " + tax.getText() +
                "\n Total with Tax: " + totalWithTax.getText());
    }

    public static void continueShopping() {
        //Log
        System.out.println("Going back to shopping");
        //Page element
        WebElement continueBtn = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/a"));
        //Action
        continueBtn.click();
    }
}
