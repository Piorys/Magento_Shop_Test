package Page;

import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WomenCategory {
    public static void getProductByName(String product) {
        //Log
        System.out.println(Utils.LogCreator.time() + "Getting product: " + product);
        //Page element
        WebElement productBtn = Setup.driver.findElement(By.partialLinkText(product));
        //Action
        try {
            productBtn.click();
        } catch (Exception e) {
            System.out.println(Utils.LogCreator.time() + "Something went wrong, error trace below:");
            System.out.println(e.toString());
        }
    }
}
