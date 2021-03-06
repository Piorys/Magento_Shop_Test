package Page;

import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderShipping {
    public static void checkTerms() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Checking 'Agree to terms' box");
        //Page elements
        WebElement checkbox = Setup.driver.findElement(By.id("cgv"));
        //Action
        checkbox.click();
    }

    public static void getShippingRate() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Getting Shipping Rate");
        //Page elements
        WebElement element = Setup.driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div"));
        //Action
        System.out.println(Utils.LogCreator.time() + "Shipping rate is " + element.getText());
    }

    public static void continueShopping() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Going back to shopping");
        //Page element
        WebElement continueBtn = Setup.driver.findElement(By.xpath("//*[@id=\"form\"]/p/a"));
        //Action
        continueBtn.click();
    }

    public static void proceed() {
        //Page element
        WebElement proceedBtn = Setup.driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
        //Log
        System.out.println(Utils.LogCreator.time() + "Proceeding with checkout");
        //Action
        proceedBtn.click();
    }
}
