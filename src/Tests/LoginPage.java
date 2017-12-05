package Tests;

import Execute.Setup;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class LoginPage {
    @Test
    public static void checkTittle() {
        String pageTittle = Setup.driver.getTitle();
        System.out.println(Utils.LogCreator.time() + "Asserting page tittle");
        System.out.println("Expected: My account - My Store, found: " + pageTittle);
        try {
            assertEquals("My account - My Store", pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
    @Test
    public static void checkWrongTittle() {
        String pageTittle = Setup.driver.getTitle();
        System.out.println(Utils.LogCreator.time() + "Asserting page tittle");
        System.out.println(Utils.LogCreator.time() + "Page Title: " + pageTittle);
        try {
            assertEquals("My account - My Store", pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Assertion Failed");
        }
    }
}
