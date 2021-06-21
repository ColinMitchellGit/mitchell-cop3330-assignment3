package ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParseFileTest {

    @Test
    void splitString() {
        ParseFile parse = new ParseFile();

        String[] array = {"1","2","3"};
        String str = "1,2,3";

        //Should split individual items in string into string array
        assertArrayEquals(array, parse.splitString(str));

    }

    @Test
    void convertToList() {
        ParseFile parse = new ParseFile();

        String str = "1,2,3";

        List<String> array;

        array = parse.convertToList(str);
        List<String> expected_array = new ArrayList<String>();

        expected_array.add("1");
        expected_array.add("2");
        expected_array.add("3");

        //Both arrays should have the same values of 1, 2, and 3
        assertTrue(expected_array.size() == array.size() && expected_array.containsAll(array) && array.containsAll(expected_array));
    }
}