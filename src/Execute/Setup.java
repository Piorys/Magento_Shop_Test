package Execute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    //Main Settings
    public static String targetSite = "http://automationpractice.com";
    public static WebDriver driver = new ChromeDriver();

    //Product settings
    public static String product = "Blouse"; //Product to search
    public static String quantity = "3"; //quantity to set
    public static String comment = "Lorem Ipsum Dolor Sit Amet"; //order comment

    //account credentials
    public static String username = "piotrryszewski@gmail.com";
    public static String password = "dupajasiu";

    public static void setUp(String target) {
        System.out.println("Opening up designated page: " + targetSite);
        driver.get(target);
        System.out.println("Maximizing window");
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        System.out.println("Instructions ended, tearing down page");
        driver.quit();
    }
}

