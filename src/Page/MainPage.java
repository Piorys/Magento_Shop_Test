package Page;

import Execute.Main;
import Execute.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    public static void goToLogin(){
        //Log
        System.out.println("Locating and clicking login page button");
        //Page Elements
        WebElement loginBtn = Setup.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
        //Action
        loginBtn.click();
    }
    public static void search(String query){
        //Log
        System.out.println("Passing query: " + query);
        //Page elements
        WebElement searchBox = Setup.driver.findElement(By.id("search_query_top"));
        WebElement submitSearch = Setup.driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        //Action
        searchBox.sendKeys(query);
        submitSearch.click();
    }
    public static void subscribeNewsletter(String mail){
        //Log
        System.out.println("Subscribing to newsletters with mail: "+ mail);
        //Page Elements
        WebElement mailInput = Setup.driver.findElement(By.id("newsletter-input"));
        WebElement btn = Setup.driver.findElement(By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button"));
        //Action
        mailInput.sendKeys(mail);
        btn.click();
    }

    // Main Categories

    public static void womenCategory(){
        //Log
        System.out.println("Going to 'Women' category");
        //Page elements
        WebElement btn = Setup.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        //Action
        btn.click();
    }
    public static void dressesCategory(){
        //Log
        System.out.println("Going to 'Dresses' category");
        //Page elements
        WebElement btn = Setup.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        //Action
        btn.click();
    }
    public static void tshirtsCategory(){
        //Log
        System.out.println("Going to 'T-Shirts' category");
        //Page elements
        WebElement btn = Setup.driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
        //Action
        btn.click();
    }


}
