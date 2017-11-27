package Page;

import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderSummary {

    public static void proceed() {
        //Page element
        WebElement proceedBtn = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
        //Log
        System.out.println("Proceeding with checkout");
        //Action
        proceedBtn.click();
    }

    public static void continueShopping() {
        //Log
        System.out.println("Going back to shopping");
        //Page element
        WebElement continueBtn = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[2]"));
        //Action
        continueBtn.click();
    }

    // TODO - CANT FIND QUANTITY FIELD
    public static void setQuantity(String quantity) {
        //Log
        System.out.println("Setting quantity to: " + quantity);
        //Page Element
        WebElement qtyField = Setup.driver.findElement(By.xpath("//*[@id=\"product_2_9_0_30216\"]/td[5]/input[2]"));
        //Action
        qtyField.sendKeys(quantity);
    }

    public static void printOrderSummary() {
        //Log
        System.out.println("Getting order price..");
        //Page Element
        WebElement products = Setup.driver.findElement(By.id("total_product"));
        WebElement shipping = Setup.driver.findElement(By.id("total_shipping"));
        WebElement totalWithoutTax = Setup.driver.findElement(By.id("total_price_without_tax"));
        WebElement tax = Setup.driver.findElement(By.id("total_tax"));
        WebElement totalWithTax = Setup.driver.findElement(By.id("total_price"));
        //Action
        System.out.println("Order summary: \n Total Products: " + products.getText() +
                "\n Total Shipping: " + shipping.getText() +
                "\n Total without Tax: " + totalWithoutTax.getText() +
                "\n Tax: " + tax.getText() +
                "\n Total with Tax: " + totalWithTax.getText());
    }

}
