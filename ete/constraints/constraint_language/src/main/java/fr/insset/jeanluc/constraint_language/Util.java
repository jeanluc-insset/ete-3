

package fr.insset.jeanluc.constraint_language;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jldeleage
 */
public class Util {


    public static String readFile(String inFilePath) throws FileNotFoundException {
        String content = new Scanner(new File(inFilePath)).useDelimiter("\\Z").next();
        return content;
    }


}
