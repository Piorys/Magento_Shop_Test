package Tests;

import Execute.Setup;

import static junit.framework.TestCase.assertEquals;

public class WomenCategory {
    public static void checkTittle() {
        String pageTittle = Setup.driver.getTitle();
        System.out.println(Setup.time() + "Asserting page tittle");
        System.out.println("Expected: Women - My Store, found: " + pageTittle);
        try {
            assertEquals("Women - My Store", pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}
