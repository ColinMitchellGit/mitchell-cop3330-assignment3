/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) throws IOException {
        WordFinder wordfinder = new WordFinder();
        Scanner inputFile = null;

        inputFile = wordfinder.initializeFile(inputFile);

        //Make additional scanner for user input
        Scanner s = new Scanner(System.in);

        //Asking user for name of output file
        String outputfile = wordfinder.promptForOutputFile(s);

        // Create FileWriter object to write to output file
        FileWriter writer = new FileWriter(outputfile);


        //Handling exceptions
        try {

            //Reading entire file
            while( inputFile.hasNext() )
            {

                //Read whole line
                String user = inputFile.nextLine();

                //Replace utilize with use
                user = user.replaceAll("utilize", "use");

                //And write line into output file
                writer.write(user);

                writer.write("\n");
            }
        }
        finally
        {
            inputFile.close();
        }

        writer.close();

        System.out.println("\nSuccessfully replaced occurrences of 'utilize' to 'use' in the file.");

    }

}
