package TestScenarios;

import Execute.Setup;
import Page.LoginPage;
import org.junit.Test;

import java.io.FileNotFoundException;

public class LoginBadBothCredentials {

    //Scenario Name
    private static String scenarioName = "LoginBadBothCredentials";
    //Start Test
    // TODO - set up criteria to test via assertion
    public static void startTest() throws FileNotFoundException {
        Utils.LogCreator.setLog(scenarioName);
        Setup.setUp(Setup.targetSite);
        Page.MainPage.goToLogin();
        LoginPage.login(Setup.badUsername,Setup.badPassword);
//        Tests.LoginPage.checkWrongTittle();
        Setup.tearDown();
    }


}
