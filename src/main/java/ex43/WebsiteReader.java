package ex43;

import java.util.Scanner;

public class WebsiteReader {

    //Reads the website name from user
    public static String readSiteName(Scanner input) {
        System.out.print("Site name: ");
        return input.nextLine();
    }

    //Reads the author name from user
    public static String readAuthor(Scanner input) {
        System.out.print("Author: ");
        return input.nextLine();
    }

    //Reads whether the user wants a javascript folder
    public static char readJavaScript(Scanner input) {
        System.out.print("Do you want a folder for JavaScript? ");
        return input.next().charAt(0);
    }

    //Reads whether the user wants a CSS folder
    public static char readCSS(Scanner input) {
        System.out.print("Do you want a folder for CSS? ");
        return input.next().charAt(0);
    }
}
