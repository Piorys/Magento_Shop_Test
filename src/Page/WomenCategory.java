package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WomenCategory {
    public static void getProductByName(String product){
        //Log
        System.out.println("Getting product: " + product);
        //Page element
        WebElement productBtn = Main.driver.findElement(By.partialLinkText(product));
        //Action
        try {
            productBtn.click();
        }catch(Exception e){
            System.out.println("Something went wrong, error trace below:");
            System.out.println(e.toString());
        }
    }
}
