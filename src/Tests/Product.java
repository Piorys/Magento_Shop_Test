package Tests;

import Execute.Setup;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Product {
    @Test
    public static void checkTittle(String product) {
        String pageTittle = Setup.driver.getTitle();
        System.out.println(Setup.time() + "Asserting page tittle");
        System.out.println("Expected: " + product + ", found: " + pageTittle);
        try {
            assertEquals(true, pageTittle.contains(product));
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}
