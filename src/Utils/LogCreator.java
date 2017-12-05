package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogCreator {
    //Generating Time Stamp for logs
    public static String time() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate + " ";
    }

    //Create Log file
    public static File createLogFile(String scenarioName) {
        String filename = time() + " " + scenarioName;
        return new File( filename + ".txt");
    }

    //Set Log output to Log file
    public static void setLog(String scenarioName) throws FileNotFoundException {
        File file = createLogFile(scenarioName);
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);
    }
}
