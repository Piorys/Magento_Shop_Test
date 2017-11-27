//Created by Piotr Rsyzewski
//Date: 27.11.2017
//Behavior: Script to go through critical path of presta-shop based web shop

package Execute;

//Selenium packages
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Page Elements
import Page.*;

public class Main {

    private static String targetSite = "http://automationpractice.com"; //Site to test
    public static WebDriver driver = new ChromeDriver(); //Browser to perform
    private static String product = "Blouse"; //Product to search
    private static String quantity = "3";
    private static String comment = "Lorem Ipsum Dolor Sit Amet";
    //account credentials
    private static String username = "piotrryszewski@gmail.com";
    private static String password = "dupajasiu";


    public static void main(String[] args) {
        setUp(targetSite);
        MainPage.goToLogin();
        Page.LoginPage.login(username,password);
        Tests.LoginPage.checkTittle();
        Page.LoginPage.backToMain();
        Tests.MainPage.checkTittle();
        Page.MainPage.womenCategory();
        Tests.WomenCategory.checkTittle();
        Page.WomenCategory.getProductByName(product);
        Tests.Product.checkTittle(product);
        Page.Product.setQuantity("2");
//        Page.Product.setSize("M");
        Page.Product.addToCart();
        Page.ProductModal.proceedToCheckout();
//        Page.OrderSummary.setQuantity(quantity);
        Page.OrderSummary.printOrderSummary();
        Page.OrderSummary.proceed();
        Page.OrderAddress.addComment(comment);
        Page.OrderAddress.proceed();
        Page.OrderShipping.checkTerms();
        Page.OrderShipping.getShippingRate();
        Page.OrderShipping.proceed();
        Page.OrderPayment.printOrderSummary();
        Page.OrderPayment.payByBankWire();
        Page.OrderPaymentConfirm.summary();
        Page.OrderPaymentConfirm.confirmOrder();
        Tests.OrderConfirmation.checkTittle();
        Page.OrderConfirmation.backToMain();
        Tests.MainPage.checkTittle();
        tearDown();
    }


    public static void setUp(String target){
        System.out.println("Opening up designated page: " + targetSite);
        driver.get(target);
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        System.out.println("Instructions ended, tearing down page");
        driver.quit();
    }
}
