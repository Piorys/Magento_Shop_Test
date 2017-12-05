package TestScenarios;

import Execute.Setup;
import Page.LoginPage;
import Page.MainPage;

import java.io.FileNotFoundException;
import java.util.Set;

public class LoginTest {
    //Scenario Name
    static String scenarioName = "LoginTest";
    public static void start() throws FileNotFoundException{
        Utils.LogCreator.setLog(scenarioName);
        Setup.setUp(Setup.targetSite);
        Tests.MainPage.checkTittle();
        MainPage.goToLogin();
        LoginPage.login(Setup.username,Setup.password);
        Tests.LoginPage.checkTittle();
        Setup.tearDown();
    }
}
