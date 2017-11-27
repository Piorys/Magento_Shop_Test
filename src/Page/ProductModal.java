package Page;

import Execute.Main;
import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.awt.windows.WEmbeddedFrame;
import java.util.concurrent.*;

public class ProductModal {
    public static void proceedToCheckout() {
        //Log
        System.out.println("Proceeding to checkout");
        //Page elements
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement proceedBtn = Setup.driver.findElement(By.partialLinkText("Proceed"));
        //Action
        proceedBtn.click();
    }

    public static void continueShoppping() {
        //Log
        System.out.println("Going back to product page");
        //Page elements
        Setup.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement continueBtn = Setup.driver.findElement(By.partialLinkText("Continue"));
        //Action
        continueBtn.click();
    }
}
