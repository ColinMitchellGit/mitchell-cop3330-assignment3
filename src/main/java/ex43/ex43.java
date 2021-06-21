/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex43;

import java.util.Scanner;
import java.io.*;

public class ex43
{
    public static void main(String[] args)
    {
        //Create scanner and websitereader class
        Scanner input = new Scanner(System.in);
        WebsiteReader generator = new WebsiteReader();

        String currentPath, author, siteName;

        char js = 'N';
        char css = 'N';

        //Get input from websitereader class methods
        siteName = generator.readSiteName(input);
        author = generator.readAuthor(input);
        js = generator.readJavaScript(input);
        css = generator.readCSS(input);

        //Get current folder for new website folder
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;

        File website = new File(currentPath);

        boolean websiteCreated = website.mkdir();

        //If creating file was successful proceed with website generation
        if(websiteCreated)
        {
            System.out.println("Created " + currentPath);
            try
            {

                //Create HTML formatting in new html file with author and sitename
                FileWriter htmlwrite = new FileWriter(new File(currentPath+"\\index.html"));

                htmlwrite.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                htmlwrite.write("\t<meta author=\""+author+"\">\n");
                htmlwrite.write("\t<title>"+siteName+"</title>\n");
                htmlwrite.write("</head>\n<body>\n\n</body>\n</html>");

                htmlwrite.close();

                System.out.println("Created " + currentPath+"\\index.html");

                //Create javascript and css folders according to user input
                if(js == 'y' || js == 'Y')
                {
                    File javascriptFolder = new File(currentPath+"\\js");
                    boolean javascriptValid = javascriptFolder.mkdir();

                    if(javascriptValid)
                    {
                        System.out.println("Created " + javascriptFolder+"\\");
                    }
                    else
                    {
                        System.out.println("Js folder not created.");
                    }
                }
                if(css == 'y' || css == 'Y')
                {
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssValid = cssFolder.mkdir();
                    if(cssValid)
                    {
                        System.out.println("Created " + cssFolder+"\\");
                    }
                    else
                    {
                        System.out.println("CSS folder not created.");
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("index.html not created.");
            }
        }
        else
        {
            System.out.println("Website folder not created.");
        }

        input.close();
    }
}