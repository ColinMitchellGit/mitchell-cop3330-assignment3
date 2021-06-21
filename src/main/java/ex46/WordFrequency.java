package ex46;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

public class WordFrequency {
    public static void loopWordInput(String s, ArrayList<String> list_total, ArrayList<String> list) {

        String[] words;
        //Split the string into separate words
        words=s.split(" ");

        //For each unique word in the line add to list, add every word to total_list
        for (String word : words) {
            list_total.add(word);

            if(Collections.frequency(list, word) == 0) {
                list.add(word);
            }
        }
    }
}
