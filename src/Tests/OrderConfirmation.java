package Tests;

import Execute.Setup;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrderConfirmation {
    @Test
    public static void checkTittle() {
        String pageTittle = Setup.driver.getTitle();
        System.out.println(Setup.time() + "Asserting page tittle");
        System.out.println("Expected: Order confirmation - My Store, found: " + pageTittle);
        try {
            assertEquals("Order confirmation - My Store", pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}
