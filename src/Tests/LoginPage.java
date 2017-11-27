package Tests;

import Execute.Main;

import static junit.framework.TestCase.assertEquals;

public class LoginPage {
    public static void checkTittle() {
        String pageTittle = Main.driver.getTitle();
        System.out.println("Asserting page tittle");
        System.out.println("Expected: My account - My Store, found: " + pageTittle);
        try {
            assertEquals("My account - My Store", pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}
