//Created by Piotr Rsyzewski
//Date: 27.11.2017
//Behavior: Script to go through critical path of magento-based web shop

package Execute;

//Selenium packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Page Elements
import Page.*;

public class Main {

    public static String targetSite = "http://automationpractice.com";
    public static WebDriver driver = new ChromeDriver();
    //Execute-account credentials
    private static String username = "piotrryszewski@gmail.com";
    private static String password = "dupajasiu";


    public static void main(String[] args) {
        setUp(targetSite);
        MainPage.goToLogin();
        Page.LoginPage.login(username,password);
        Tests.LoginPage.checkTittle();
        Page.LoginPage.backToMain();
        Tests.MainPage.checkTittle();
        tearDown();
    }



    public static void setUp(String target){
        System.out.println("Opening up designated page: " + targetSite);
        driver.get(target);
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        System.out.println("Instructions ended, tearing down page");
        driver.quit();
    }
}
