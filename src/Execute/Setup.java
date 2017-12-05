package Execute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Setup {

    //Main Settings
    public static String targetSite = "http://automationpractice.com"; //Site
    public static WebDriver driver = new ChromeDriver(); //Browser

    //Product settings
    public static String product = "Blouse"; //Product to search
    public static String quantity = "2"; //quantity to set
    public static String comment = "Lorem Ipsum Dolor Sit Amet"; //order comment

    //working account credentials
    public static String username = "piotrryszewski@gmail.com";
    public static String password = "dupajasiu";

    //Bad account credentials
    public static String badUsername = "thisdoesntwork@test.pl";
    public static String badPassword = "Konstantynopolitanczykowna2137";

    //Open up target Page
    public static void setUp(String target) {
        System.out.println("Opening up designated page: " + targetSite);
        driver.get(target);
        System.out.println("Maximizing window");
        driver.manage().window().maximize();
    }

    //Close target Page
    public static void tearDown() {
        System.out.println("Instructions ended, tearing down page");
        driver.quit();
    }


}

