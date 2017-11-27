package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderPaymentConfirm {

    public static void backToMethods() {
        //Log
        System.out.println("Going back to payment methods");
        //Page element
        WebElement continueBtn = Main.driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/a"));
        //Action
        continueBtn.click();
    }

    public static void confirmOrder(){
        //Log
        System.out.println("Confirming order");
        //Page Element
        WebElement btn = Main.driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
        //Action
        btn.click();
    }

    public static String summary(){
        //Log
        System.out.println("Getting order Summary");
        //Page Element
        WebElement amount = Main.driver.findElement(By.id("amount"));
        //Action
        return "Order total (tax included) is: " + amount;
    }

}
