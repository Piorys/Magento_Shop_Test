package Tests;

import Execute.Main;

import static junit.framework.TestCase.assertEquals;

public class Product {
    public static void checkTittle(String product){
        String pageTittle = Main.driver.getTitle();
        System.out.println("Asserting page tittle");
        System.out.println("Expected: " + product + ", found: " + pageTittle);
        try{
            assertEquals(true,pageTittle.contains(product));
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}
