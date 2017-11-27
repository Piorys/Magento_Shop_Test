package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderShipping {
    public static void checkTerms() {
        //Log
        System.out.println("Checking 'Agree to terms' box");
        //Page elements
        WebElement checkbox = Main.driver.findElement(By.id("cgv"));
        //Action
        checkbox.click();
    }

    public static String getShippingRate() {
        //Log
        System.out.println("Getting Shipping Rate");
        //Page elements
        WebElement element = Main.driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div/text()"));
        //Action
        return "Shipping rate is " + element;
    }

    public static void continueShopping() {
        //Log
        System.out.println("Going back to shopping");
        //Page element
        WebElement continueBtn = Main.driver.findElement(By.xpath("//*[@id=\"form\"]/p/a"));
        //Action
        continueBtn.click();
    }

    public static void proceed() {
        //Page element
        WebElement proceedBtn = Main.driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
        //Log
        System.out.println("Proceeding with checkout");
        //Action
        proceedBtn.click();
    }
}
