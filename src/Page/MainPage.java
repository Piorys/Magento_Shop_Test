package Page;

import Execute.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    public static void goToLogin(){
        System.out.println("Locating and clicking login page button");
        WebElement loginBtn = Main.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        loginBtn.click();
    }
}
