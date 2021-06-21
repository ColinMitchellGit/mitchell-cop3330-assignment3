/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex41
{
    public static void main(String[] args){

        //Create scanner to read names from input file
        NameSorter sorter = new NameSorter();

        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("C:\\Users\\Colin\\IdeaProjects\\Assignment_3\\src\\main\\java\\ex41\\exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Create an arraylist to store names
        ArrayList<String> names = new ArrayList<String>();

        //Read names into arraylist using readNames function from class
        sorter.readNames(inputFile, names);

        //Close scanner after reading names
        inputFile.close();

        //Sort the arraylist using sort function
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        //Write names to output file
        try {
            sorter.outputNames(names);
        }
        //Print exception if any
        catch (Exception e) {
            System.out.println(e);
        }
    }
}