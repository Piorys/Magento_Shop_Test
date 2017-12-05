package Page;

import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static void login(String username, String password) {
        //Page Elements
        WebElement loginInput = Setup.driver.findElement(By.id("email"));
        WebElement passwordInput = Setup.driver.findElement(By.id("passwd"));
        WebElement signInBtn = Setup.driver.findElement(By.id("SubmitLogin"));
        //Actions
        System.out.println(Utils.LogCreator.time() + "Passing username: " + username);
        loginInput.sendKeys(username);
        System.out.println(Utils.LogCreator.time() + "Passing password");
        passwordInput.sendKeys(password);
        System.out.println(Utils.LogCreator.time() + "Submitting credentials");
        signInBtn.click();
        //Assertion
    }

    public static void backToMain() {
        WebElement logo = Setup.driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        System.out.println(Utils.LogCreator.time() + "Going back to Main Page");
        logo.click();
    }
}
