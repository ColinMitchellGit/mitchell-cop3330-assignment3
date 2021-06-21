/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex42;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ex42
{
    public static void main(String[] args) throws IOException {
        ParseFile parse = new ParseFile();

        try (BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt"))) {
            String line;
            List<String> info;

            parse.printHeaders();

            while ((line = br.readLine()) != null) {
                info = parse.convertToList(line);
                parse.printInfo(info);
            }
        }
    }
}