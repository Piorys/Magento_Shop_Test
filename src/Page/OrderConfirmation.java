package Page;

import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderConfirmation {

    public static void printSummary() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Getting Final Order Summary..");
        //Page Elements
        WebElement price = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/span/strong"));
        WebElement ownerName = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/strong[1]"));
        WebElement bankName = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/strong[3]"));
        //Action
        System.out.println(Utils.LogCreator.time() + "Order Complete");
        System.out.println("Amount: " + price.getText());
        System.out.println("Owner Name: " + ownerName.getText());
        System.out.println("Bank Name: " + bankName.getText());
    }

    public static void backToOrders() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Going back to orders");
        //Page Elements
        WebElement back = Setup.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a"));
        //Action
        back.click();
    }

    public static void backToMain() {
        //Log
        System.out.println(Utils.LogCreator.time() + "Going back to Main Page..");
        //Page Elements
        WebElement logo = Setup.driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        //Action
        logo.click();
    }
}
