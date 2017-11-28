package TestScenarios;

import Execute.Setup;
import Page.MainPage;
import org.junit.Test;

import java.io.FileNotFoundException;

public class CriticalPathTest {


    public static void startCriticalPathTest() throws FileNotFoundException {
        String scenarioName = "Critical Path Test";

        Setup.setLog(scenarioName);
        Setup.setUp(Setup.targetSite);
        MainPage.goToLogin();
        Page.LoginPage.login(Setup.username, Setup.password);
        Tests.LoginPage.checkTittle();
        Page.LoginPage.backToMain();
        Tests.MainPage.checkTittle();
        Page.MainPage.womenCategory();
        Tests.WomenCategory.checkTittle();
        Page.WomenCategory.getProductByName(Setup.product);
        Tests.Product.checkTittle(Setup.product);
        Page.Product.setQuantity(Setup.quantity);
//        Page.Product.setSize("M");
        Page.Product.addToCart();
        Page.ProductModal.proceedToCheckout();
//        Page.OrderSummary.setQuantity(quantity);
        Page.OrderSummary.printOrderSummary();
        Page.OrderSummary.proceed();
        Page.OrderAddress.addComment(Setup.comment);
        Page.OrderAddress.proceed();
        Page.OrderShipping.checkTerms();
        Page.OrderShipping.getShippingRate();
        Page.OrderShipping.proceed();
        Page.OrderPayment.printOrderSummary();
        Page.OrderPayment.payByBankWire();
        Page.OrderPaymentConfirm.printSummary();
        Page.OrderPaymentConfirm.confirmOrder();
        Tests.OrderConfirmation.checkTittle();
        Page.OrderConfirmation.backToMain();
        Tests.MainPage.checkTittle();
        Setup.tearDown();
    }
}
