/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex41;

import java.io.*;
import java.util.*;

public class NameSorter {

    //Create readNames function to read the names from the input file
    public static void readNames(Scanner input, ArrayList<String> names) {

        // reading the data till the file has nextLine
        while (input.hasNextLine()) {

            //Append name from next line of input file
            names.add(input.nextLine());
        }
    }

    //Create the outputNames function to output the names from list of names
    public static void outputNames(ArrayList<String> names) throws IOException {

        //Open filewriter for output file
        FileWriter output = new FileWriter("exercise41_output.txt");

        // Write default text for output file for how many names there are
        output.write("Total of " + names.size() + " names\n");
        output.write("-----------------\n");

        // Write names in file
        for (String i : names) {
            output.write(i + "\n");
        }

        //Close the filewriter
        output.close();
    }
}