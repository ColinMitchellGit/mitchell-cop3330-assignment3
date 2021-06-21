/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex44;

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class ex44 {
    public static void main(String[] args) {

        //Create objects to parse json
        JSONParser parser = new JSONParser();
        JSONSearch search = new JSONSearch();

        try {
            JSONArray products = search.initializeArray(parser);

            //Boolean to check if the entered product was found
            Boolean run = true;

            while(run) {
                run = search.searchArray(products, run);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}