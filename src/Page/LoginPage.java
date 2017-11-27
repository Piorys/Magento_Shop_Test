package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;

public class LoginPage {

    public static void login(String username, String password){
        //Page Elements
        WebElement loginInput = Main.driver.findElement(By.id("email"));
        WebElement passwordInput = Main.driver.findElement(By.id("passwd"));
        WebElement signInBtn = Main.driver.findElement(By.id("SubmitLogin"));
        //Actions
        System.out.println("Passing username: " + username);
        loginInput.sendKeys(username);
        System.out.println("Passing password");
        passwordInput.sendKeys(password);
        System.out.println("Submitting credentials");
        signInBtn.click();
        //Assertion
    }

    public static void backToMain(){
        WebElement logo = Main.driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        System.out.println("Going back to Main Page");
        logo.click();
    }
}
