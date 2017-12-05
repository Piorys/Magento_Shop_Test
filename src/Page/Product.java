package Page;

import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product {
    public static void setQuantity(String quantity) {
        //Log
        System.out.println(Utils.LogCreator.time() + "Setting quantity for product to: " + quantity);
        //Page element
        WebElement quantityInput = Setup.driver.findElement(By.id("quantity_wanted"));
        //Action
        quantityInput.clear();
        quantityInput.sendKeys(quantity);
    }

    //TODO - CANT FIND DESIRED SIZE
    public static void setSize(String size) {
        //Log
        System.out.println(Utils.LogCreator.time() + "Setting size for product to: " + size);
        //Page element
        Select sizeDropdown = new Select(Setup.driver.findElement(By.id("group_1")));
        //Action
        sizeDropdown.selectByValue(size);
    }

    public static void addToCart() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Adding product to cart");
        //Page element
        WebElement btn = Setup.driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
        //Action
        btn.click();
    }

}
