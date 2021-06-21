package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void initializeFile() throws FileNotFoundException {
        WordFinder wordfinder = new WordFinder();
        
        Scanner input_file = null;
        try {
            input_file = new Scanner(new File("exercise45_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        wordfinder.initializeFile(input_file);
    }

    @Test
    void promptForOutputFile() {
        Scanner output = new Scanner("Name\nName");
        WordFinder wordfinder = new WordFinder();

        assertEquals("Name", wordfinder.promptForOutputFile(output));
    }
}