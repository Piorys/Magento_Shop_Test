package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderSummary {

    public static void proceed() {
        //Page element
        WebElement proceedBtn = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        //Log
        System.out.println("Proceeding with checkout");
        //Action
        proceedBtn.click();
    }

    public static void continueShopping() {
        //Log
        System.out.println("Going back to shopping");
        //Page element
        WebElement continueBtn = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]"));
        //Action
        continueBtn.click();
    }

    public static void setQuantity(String quantity) {
        //Log
        System.out.println("Setting quantity to: " + quantity);
        //Page Element
        WebElement qtyField = Main.driver.findElement(By.xpath("//*[@id=\"product_2_9_0_30216\"]/td[5]/input[2]"));
        //Action
        qtyField.sendKeys(quantity);
    }

    public static void printOrderSummary() {
        //Log
        System.out.println("Getting order price..");
        //Page Element
        WebElement products = Main.driver.findElement(By.id("total_product"));
        WebElement shipping = Main.driver.findElement(By.id("total_shipping"));
        WebElement totalWithoutTax = Main.driver.findElement(By.id("total_price_without_tax"));
        WebElement tax = Main.driver.findElement(By.id("total_tax"));
        WebElement totalWithTax = Main.driver.findElement(By.id("total_price"));
        //Action
        System.out.println("Order summary: \n Total Products: " + products +
                "\n Total Shipping: " + shipping +
                "\n Total without Tax: " + totalWithoutTax +
                "\n Tax: " + tax +
                "\n Total with Tax: " + totalWithTax);
    }

}
