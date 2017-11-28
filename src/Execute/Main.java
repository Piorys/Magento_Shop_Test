//Created by Piotr Rsyzewski
//Date: 27.11.2017

package Execute;

//Selenium packages

import TestScenarios.CriticalPathTest;
import org.junit.Test;

import java.io.FileNotFoundException;

public class Main {
    @Test
    public static void main(String[] args) throws FileNotFoundException {
        CriticalPathTest.startCriticalPathTest();
    }
}
