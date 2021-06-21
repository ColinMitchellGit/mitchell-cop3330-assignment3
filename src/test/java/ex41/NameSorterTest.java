package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void readNames() {
        NameSorter sorter = new NameSorter();
        Scanner input = new Scanner("Mitchell, Colin");
        ArrayList<String> names = new ArrayList<String>();

        sorter.readNames(input, names);

        System.out.println("No exceptions in readNames()");
    }

    @Test
    void outputNames() {
        NameSorter sorter = new NameSorter();
        ArrayList<String> names = new ArrayList<String>();

        names.add("Mitchell, Colin");
        names.add("Colin, Colin");

        try {
            sorter.outputNames(names);
            System.out.println("No exceptions in outputNames()");
        }
        //Print exception if any
        catch (Exception e) {
            System.out.println(e);
        }
    }
}