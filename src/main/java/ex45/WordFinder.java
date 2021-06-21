package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordFinder {

    //Initializing scanner to the input file and returning it
    public static Scanner initializeFile(Scanner input_file) {
        try {
            input_file = new Scanner(new File("exercise45_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return input_file;
    }

    //Prompting the user for the name of the output file and returning it
    public static String promptForOutputFile(Scanner output) {
        String name;
        System.out.print("\nEnter the name of Output File : ");
        name = output.next();
        return name;
    }
}
