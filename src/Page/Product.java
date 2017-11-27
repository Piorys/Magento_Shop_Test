package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product {
    public static void setQuantity(String quantity){
        //Log
        System.out.println("Setting quantity for product to: " + quantity);
        //Page element
        WebElement quantityInput = Main.driver.findElement(By.id("quantity_wanted"));
        //Action
        quantityInput.sendKeys(quantity);
    }
    //TODO - CANT FIND DESIRED SIZE
    public static void setSize(String size){
        //Log
        System.out.println("Setting size for product to: " + size);
        //Page element
        Select sizeDropdown = new Select(Main.driver.findElement(By.id("group_1")));
        //Action
        sizeDropdown.selectByValue(size);
    }
    public static void addToCart(){
        //Log
        System.out.println("Adding product to cart");
        //Page element
        WebElement btn = Main.driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
        //Action
        btn.click();
    }

}
