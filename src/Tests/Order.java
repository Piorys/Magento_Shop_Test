package Tests;

import Execute.Setup;

import static junit.framework.TestCase.assertEquals;

public class Order {
    public static void checkTittle() {
        String pageTittle = Setup.driver.getTitle();
        System.out.println("Asserting page tittle");
        System.out.println("Expected: Order - My Store, found: " + pageTittle);
        try {
            assertEquals("Order - My Store", pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}
