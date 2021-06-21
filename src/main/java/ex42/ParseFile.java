package ex42;

import java.util.Arrays;
import java.util.List;

public class ParseFile {
    public static void printHeaders() {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
    }

    public static void printInfo(List<String> info) {
        System.out.println(String.format("%-10s" + "%-10s" + "%-2s", info.get(0), info.get(1), info.get(2)));
    }

    //Splits the string, which is separated by commas, in to a string array of the individual items
    public static String[] splitString(String line) {
        return (line.split(",", -1));
    }

    //Converts the comma separated string and converts it to a list
    public static List<String> convertToList(String line) {
        return(Arrays.asList(splitString(line)));
    }
}
