package Page;

import Execute.Main;
import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderAddress {

    public static void addNewAddress() {
        //Log
        System.out.println("Proceeding to add new address");
        //Page Elements
        WebElement btn = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p/a"));
        //Action
        btn.click();
    }

    public static void addComment(String comment) {
        //Log
        System.out.println("Adding comment to order: " + comment);
        //Page Elements
        WebElement textArea = Setup.driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea"));
        //Action
        textArea.sendKeys(comment);
    }

    public static void continueShopping() {
        //Log
        System.out.println("Going back to shopping");
        //Page element
        WebElement continueBtn = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/a"));
        //Action
        continueBtn.click();
    }

    public static void proceed() {
        //Page element
        WebElement proceedBtn = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
        //Log
        System.out.println("Proceeding with checkout");
        //Action
        proceedBtn.click();
    }
}
