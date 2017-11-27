package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderConfirmation {

    public static void printSummary(){
        //Log
        System.out.println("Getting Final Order Summary..");
        //Page Elements
        WebElement price = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/span/strong"));
        WebElement ownerName = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/strong[1]"));
        WebElement bankName = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/strong[3]"));
        //Action
        System.out.println("Order Complete");
        System.out.println("Amount: "+price);
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Bank Name: "+bankName);
    }
    public static void backToOrders(){
        //Log
        System.out.println("Going back to orders");
        //Page Elements
        WebElement back = Main.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a"));
        //Action
        back.click();
    }
    public static void backToMain(){
        //Log
        System.out.println("Going back to Main Page..");
        //Page Elements
        WebElement logo = Main.driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        //Action
        logo.click();
    }
}
