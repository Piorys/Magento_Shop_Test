package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.awt.windows.WEmbeddedFrame;

public class ProductModal {
    public static void proceedToCheckout() {
        //Log
        System.out.println("Proceeding to checkout");
        //Page elements
        WebElement proceedBtn = Main.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        //Action
        proceedBtn.click();
    }

    public static void continueShoppping() {
        //Log
        System.out.println("Going back to product page");
        //Page elements
        WebElement continueBtn = Main.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        //Action
        continueBtn.click();
    }
}
