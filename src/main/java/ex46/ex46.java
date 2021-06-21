/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex46;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ex46 {
    public static void main(String[] args) throws IOException {

        //Create input file
        File file = new File("exercise46_input.txt");
        WordFrequency frequency = new WordFrequency();

        //Initialize the word Array
        String[] words = null;

        //Create file reader
        FileReader fr = new FileReader(file);

        //Create bufferedreader
        BufferedReader br = new BufferedReader(fr);

        String s;

        ArrayList<String> list_total = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();

        //Reading Content from the file
        while((s=br.readLine())!=null) {
            frequency.loopWordInput(s,list_total,list);
        }

        String str = "*";

        //For each unique word in the list, find the total number of them
        list.forEach((word) -> System.out.println(word + ": " + str.repeat(Collections.frequency(list_total, word))));


        fr.close();
    }
}